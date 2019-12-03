package com.example.email.service;

import com.example.email.entity.Email;

/**
 * @author zhangtao
 * @date 创建时间 2019/11/19
 * @version 1.0
 */

public interface EmailService {

  /**
   *发送普通邮件
   * @param email
   */
  void send(Email email) throws Exception;

  /**
   *发送Html邮件
   * @param email
   */
  void sendHtml(Email email) throws Exception;

  /**
   *发送Freemarker模板邮件
   * @param mail
   */
  void sendFreemark(Email mail) throws Exception;

  /**
   *发送Thymeleaf模板邮件
   * @param email
   */
  void sendThymeleaf(Email email) throws Exception;
}
