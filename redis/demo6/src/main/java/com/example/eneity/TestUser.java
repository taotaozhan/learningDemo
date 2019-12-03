package com.example.eneity;


import java.io.Serializable;


/**
 * @author zhangtao
 * @data  2019/10/10
 * @deprecated   实体类test_user
 */

public class TestUser  implements Serializable {

    private static final long serialVersionUID = -8366929034564774130L;

    private Integer id;
    private String name;
    private String password;
    private Integer age;

    public TestUser(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "id"+id+"  "+"name"+name+"  "+"password"+password+"   "+"age"+"   "+age;
    }
}
