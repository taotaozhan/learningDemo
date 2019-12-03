package com.example.entity;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

/**
 * @author zhangtao
 * @date 2019/10/17
 * @deprecated
 */
public class TestUser {

  @NotEmpty(message = "用户名不能为空")
  @Length(max = 12, min = 6, message = "用户名长度位于6到12之间")
  public String username;
  @Email(message = "请输入正确的邮箱格式")
  public String email;
  @Pattern(regexp = "^(\\d{18,18}|\\d{15,15}|(\\d{17,17}[x|X]))$", message = "身份证格式错误")
  public String idCard;

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public String getIdCard() {
    return idCard;
  }


  public void setIdCard(String idCard) {
    this.idCard = idCard;
  }


}
