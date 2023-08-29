package com.ymj.myschedule.mapper;


import com.ymj.myschedule.pojo.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TeacherMapper {
    // 获取所有教师的信息
    @Results(id = "teacherMap", value = {
            @Result(column = "teacherId", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "teacherNum", property = "number"),
            @Result(column = "password", property = "password")
    })
    @Select("select * from user_info.teacher_info")
    List<Teacher> list();

    // 获取指定工号的教师信息
    @ResultMap("teacherMap")
    @Select("select * from user_info.teacher_info where teacherId = #{teacherNum}")
    Teacher getTeacherByNum(String teacherNum);

    // 添加一名新的教师
    @Insert("insert into teacher_info(name, password, teacherNum) " +
            "VALUES(#{name}, #{password}, #{number})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertTeacher(Teacher teacher);

    // 更新一名教师的信息
    @Update("update teacher_info set name = #{name}, password = #{password}, " +
            "teacherNum = #{number} where teacherId = #{id}")
    void updateTeacher(Teacher teacher);

    // 删除指定工号的教师信息
    @Delete("DELETE FROM teacher_info WHERE teacherNum = #{teacherNum}")
    void deleteTeacher(String teacherNum);
}
