package com.example.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangtao
 * @date 2019/11/1
 */
@RestController
@RequestMapping("/email")
public class EmaliController {

  @Autowired
  private JavaMailSender jms;
  @Value("${spring.mail.username}")
  private String from;

  @RequestMapping("/sendSimpleEmail")
  public String sendSimpleEmail() {
    try {
      SimpleMailMessage message = new SimpleMailMessage();
      message.setFrom(from);
      message.setTo("tangzhijie@skyworth.com"); // 接收地址
      message.setSubject("小唐"); // 标题
      message.setText("测试邮件 发给小唐"); // 内容
      jms.send(message);
      return "发送成功";
    } catch (Exception e) {
      e.printStackTrace();
      return e.getMessage();
    }
  }


}
