package com.skyworth.mongodb.entity;

/**
 * @author zhangtao
 * @date 2019/11/1
 */
public class User {

  private Integer id;
  private String name;

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


  public Integer getAge() {
    return age;
  }


  public void setAge(Integer age) {
    this.age = age;
  }

  private Integer age;

}
