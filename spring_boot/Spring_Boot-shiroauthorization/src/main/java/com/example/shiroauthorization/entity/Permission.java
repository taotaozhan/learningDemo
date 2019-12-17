package com.example.shiroauthorization.entity;

import java.io.Serializable;

/**
 * @author zhangtao
 * @version 创建时间 2019/12/9
 */

public class Permission implements Serializable {

  private static final long serialVersionUID = -3440372534300871944L;

  private  int id;
  private String url;
  private String name;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
