package com.example.ehcachecache.entity;

import java.io.Serializable;

/**
 * @author zhangtao
 * @date 2019/12/3
 */

public class Student implements Serializable {

  private static final long serialVersionUID =  -339516038496531943L;

  private String sno;
  private String sName;
  private String sSex;
  private String databse;

  public String getSno() {
    return sno;
  }

  public void setSno(String sno) {
    this.sno = sno;
  }

  public String getsName() {
    return sName;
  }

  public void setsName(String sName) {
    this.sName = sName;
  }

  public String getsSex() {
    return sSex;
  }

  public void setsSex(String sSex) {
    this.sSex = sSex;
  }

  public String getDatabse() {
    return databse;
  }

  public void setDatabse(String databse) {
    this.databse = databse;
  }
}
