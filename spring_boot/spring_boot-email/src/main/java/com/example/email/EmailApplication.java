package com.example.email;

import com.example.email.entity.Email;
import com.example.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangtao
 * @date 创建时间 2109/11/20
 * @version 1.0
 */

@SpringBootApplication
public class EmailApplication implements CommandLineRunner {


  public static void main(String[] args) {
    SpringApplication.run(EmailApplication.class, args);
  }

  @Autowired
  private EmailService emailService;

  @Override
  public void run(String... args) throws Exception {
    Email mail = new Email();
    mail.setEmail("1186447959@qq.com");
    mail.setSubject("你个小逗比");
    mail.setContent("欢迎您 asfjdsk;laoielw");
    mail.setTemplate("welcome");
 //  emailService.send(mail);
   emailService.sendFreemark(mail);
  }
}
