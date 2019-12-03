package com.example.template.pojo;

import java.io.Serializable;

/**
 * @author zhangtao
 * @version 2019/11/4
 */
public class Student implements Serializable {

  private String sno;
  private String sname;
  private String ssex;

  public String getSno() {
    return sno;
  }


  public void setSno(String sno) {
    this.sno = sno;
  }


  public String getSsex() {
    return ssex;
  }


  public void setSsex(String sex) {
    this.ssex = sex;
  }


  public String getSname() {
    return sname;
  }


  public void setSname(String sname) {
    this.sname = sname;
  }


}
