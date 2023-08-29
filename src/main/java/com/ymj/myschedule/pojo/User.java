package com.ymj.myschedule.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    //姓名
    private String name;
    //学工号
    private String number;
    //密码
    private String password;
    //在数据库中的id
    private Integer id;

    public User(String name, String number, String password){
        setName(name);
        setNumber(number);
        setPassword(password);
    }

}
