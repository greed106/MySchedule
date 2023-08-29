package com.ymj.myschedule;

import com.ymj.myschedule.mapper.TeacherMapper;
import com.ymj.myschedule.pojo.Teacher;
import com.ymj.myschedule.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyScheduleApplicationTests {

    //用对象的方式操作数据库
    @Autowired
    private TeacherMapper studentMapper;

    @Test
    public void testStudent(){
        //测试list()
//        for(User user: studentMapper.list()){
//            System.out.println(user);
//        }

        //测试getStudentByNum()
//        User user = studentMapper.getStudentByNum("2022212414");
//        System.out.println(user);

//        测试insertStudent()
//        Teacher stu = new Teacher("王子亮","2013213137","123");
//        studentMapper.insertTeacher(stu);
//        System.out.println("id="+stu.getId());

        //测试updateStudent()
//        Teacher stu = new Teacher("王子亮","2013213137","321",8);
//        studentMapper.updateTeacher(stu);


        //测试deleteStudent()
//        studentMapper.deleteTeacher("2013213137");

    }


}
