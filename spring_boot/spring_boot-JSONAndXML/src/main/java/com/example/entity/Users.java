package com.example.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author zhangtao
 * @date 2019/10/17
 * @deprecated
 */
@XmlRootElement
public class Users {

  private int id;
  private String username;
  private String address;

  public Users(int id, String username, String address) {
    this.id = id;
    this.username = username;
    this.address = address;
  }


  public Users() {
  }


  @XmlElement
  public int getId() {
    return id;
  }


  public void setId(int id) {
    this.id = id;
  }


  @XmlElement
  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  @XmlElement
  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


}
