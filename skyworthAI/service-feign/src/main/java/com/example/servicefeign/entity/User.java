package com.example.servicefeign.entity;

/**
 * @author zhangtao
 * @date 2019/10/23
 */
public class User {

  private int id;
  private String username;
  private String password;
  private String realname;

  public int getId() {
    return id;
  }


  public void setId(int id) {
    this.id = id;
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


  public void setPassword(String password) {
    this.password = password;
  }


  public String getRealname() {
    return realname;
  }


  public void setRealname(String realname) {
    this.realname = realname;
  }


}
