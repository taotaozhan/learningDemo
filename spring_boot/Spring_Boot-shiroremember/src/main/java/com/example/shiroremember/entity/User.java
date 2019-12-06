package com.example.shiroremember.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhangtao
 * @date 创建时间 2019/12/6
 */

public class User implements Serializable {

  private static final long serialVersionUID = -5440372534300871944L;


  private int id;
  private String username;
  private String password;
  private Date  creatTime;
  private String status;

  public static long getSerialVersionUID() {
    return serialVersionUID;
  }

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

  public Date getCreatTime() {
    return creatTime;
  }

  public void setCreatTime(Date creatTime) {
    this.creatTime = creatTime;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
