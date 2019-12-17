package com.example.shiroauthorization.entity;

import java.io.Serializable;

/**
 * @author zhangtao
 * @version 创建时间 2019/12/9
 */
public class Role implements Serializable {

  private static final long serialVersionUID = -2440372534300871944L;

  private int id;
  private String name;
  private String memo;

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

  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }
}
