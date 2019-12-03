package com.example.entity;


import java.io.Serializable;

/**
 * @author zhagntao
 * @date 2019/10/8
 *  redis配置类
 */
public class User implements Serializable {

    private static final long serialVersionUID = -8366929034564774130L;


    private Integer id;
    private String username;
    private String password;
    private String rediskey;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRediskey() {
        return rediskey;
    }

    public void setRediskey(String rediskey) {
        this.rediskey = rediskey;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String  password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "id="+id +"username="+username+"password="+password+"rediskey"+rediskey;
    }
}
