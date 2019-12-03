package com.example.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author zhangtao
 * @date 2019/10/9
 * @deprecated 实体类 testuser
 */

@Entity
@Table(name="test_user")
public class TestUser {

    private int id;
    private String name;
    private String password;
    private int age;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "id="+id+"/"+"name="+name+"/"+"password="+password+"age="+age ;
    }
}
