package com.ymj.myschedule.mapper;


import com.ymj.myschedule.pojo.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper
{
    //获取所有学生的信息
    @Results(id = "studentMap", value = {
        @Result(column = "studentId", property = "id"),
        @Result(column = "name", property = "name"),
        @Result(column = "stuNum", property = "number"),
        @Result(column = "password", property = "password")
    })
    @Select("select * from user_info.student_info")
    List<Student> list();

    //获取指定学号的学生信息
    @ResultMap("studentMap")
    @Select("select * from user_info.student_info where stuNum = #{stuNum}")
    Student getStudentByNum(String stuNum);

    //添加一名新的学生
    @Insert("insert into student_info(name, password, stuNum) " +
            "VALUES(#{name},#{password},#{number})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertStudent(Student stu);

    //更新一名学生的信息
    @Update("update student_info set name=#{name},password=#{password}," +
            "stuNum=#{number} where studentId=#{id}")
    void updateStudent(Student stu);

    //删除指定学号的学生信息
    @Delete("DELETE FROM student_info WHERE stuNum =#{number}")
    void deleteStudent(String number);

}
