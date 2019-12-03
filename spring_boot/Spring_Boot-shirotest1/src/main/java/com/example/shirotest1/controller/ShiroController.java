package com.example.shirotest1.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangtao
 * @date 创建时间 2019/11/21
 * @version 1.0
 */
@RestController
public class ShiroController {

  @PostMapping("/doLogin")
  public void doLogin(String username, String password) {
    Subject subject = SecurityUtils.getSubject();
    try
    {
      subject.login(new UsernamePasswordToken(username, password));
      System.out.println("登录成功!");
    } catch (AuthenticationException e) {
      e.printStackTrace();
      System.out.println("登录失败!");
    }
  }
  @GetMapping("/hello")
  public String hello() {
    return "hello";
  }


  @GetMapping("/login")
  public String login() {
    return "please login!";
  }
}
