package com.ymj.myschedule.pojo;

public class Teacher extends User {
    public Teacher(String name, String number, String password, Integer id) {
        super(name, number, password, id);
    }

    public Teacher(String name, String number, String password) {
        super(name, number, password);
    }
}
