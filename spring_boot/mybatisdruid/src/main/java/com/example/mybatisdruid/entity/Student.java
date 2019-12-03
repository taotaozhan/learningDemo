package com.example.mybatisdruid.entity;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author zhangtao
 * @version 创建时间 2019/11/4
 */
public class Student {

  private String sno;
  private String sname;
  private String ssex;

  public String getSno() {
    return sno;
  }


  public void setSno(String sno) {
    this.sno = sno;
  }


  public String getSname() {
    return sname;
  }


  public void setSname(String sname) {
    this.sname = sname;
  }


  public String getSsex() {
    return ssex;
  }


  public void setSsex(String ssex) {
    this.ssex = ssex;
  }


}
