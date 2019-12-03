package com.example.email.service.Impl;

import com.example.email.entity.Email;
import com.example.email.service.EmailService;
import com.example.email.util.MailUtil;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.thymeleaf.spring5.SpringTemplateEngine;

import javax.mail.internet.MimeMessage;
import java.util.HashMap;
import java.util.Map;


/**
 * @author zhangtao
 * @data 创建时间
 * @version 1.0
 */
@Service
public class EmailServiceImp implements EmailService {


  @Autowired
  //执行者
  private JavaMailSender mailSender;

  /**
   * freemark
   */
  @Autowired
  public Configuration configuration;
  @Autowired
  public SpringTemplateEngine springTemplateEngine;
  @Value("${spring.mail.username}")
  private String from;


  @Override
  public void send(Email email) throws Exception {
    MailUtil mailUtil  = new MailUtil();
    SimpleMailMessage mailMessage = new SimpleMailMessage();
    //发送人
    mailMessage.setFrom(from);
    //接收人
    mailMessage.setTo(email.getEmail());
    //邮件主题
    mailMessage.setSubject(email.getSubject());
    //邮件内容
    mailMessage.setText(email.getContent());
    mailUtil.start(mailSender,mailMessage);
  }

  @Override
  public void sendHtml(Email email) throws Exception {

  }

  @Override
  public void sendFreemark(Email mail) throws Exception {
    MimeMessage mailMessage = mailSender.createMimeMessage();
    MimeMessageHelper helper = new MimeMessageHelper(mailMessage,true);
    helper.setFrom(from);
    helper.setTo(mail.getEmail());
    helper.setSubject(mail.getSubject());
    Map<String, Object> model = new HashMap<String, Object>();
    model.put("content", mail.getContent());
    Template template = configuration.getTemplate(mail.getTemplate()+".flt");
    String text = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);
    helper.setText(text, true);
    mailSender.send(mailMessage);
  }

  @Override
  public void sendThymeleaf(Email email) throws Exception {

  }


}
