package com.example.email.entity;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangtao
 * @date 创建时间 2019/11/19
 * @version 1.0
 */

public class Email implements Serializable {
  private static final Long serialVersionUID =  1L;

  //接收方邮件
  private String  email;
  //邮件主题
  private String subject;
  //邮件内容
  private String content;
  //模板
  private String template;
  //自定义参数
  private HashMap<String,String> kvMap;

  public static Long getSerialVersionUID() {
    return serialVersionUID;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public HashMap<String, String> getKvMap() {
    return kvMap;
  }

  public void setKvMap(HashMap<String, String> kvMap) {
    this.kvMap = kvMap;
  }
}
