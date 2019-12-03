package com.example.mongodbdemo.entity;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


import java.io.Serializable;

/**
 * @author zhangtao
 * @date 创建时间 2019/11/19
 * @version 1.0
 */

@Document(collection = "user")
@CompoundIndexes({
    @CompoundIndex(name = "age_idx",def = "{'name':1,'age':-1}")
})
public class User implements Serializable {

  private static final Long serialVersionUID = 1L;
  @Indexed
  private String uid;
  private String name;
  private int age;
  @Transient
  private String address;

  public User(String uid, String name, int age) {
    this.uid = uid;
    this.name = name;
    this.age = age;
  }

  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return String.format(
        "Customer[name='%s', age='%s']",
        name, age);
  }
}
