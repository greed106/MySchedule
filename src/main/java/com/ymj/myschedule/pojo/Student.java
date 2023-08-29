package com.ymj.myschedule.pojo;

public class Student extends User {
    public Student(String name, String number, String password, Integer id) {
        super(name, number, password, id);
    }

    public Student(String name, String number, String password) {
        super(name, number, password);
    }
}
