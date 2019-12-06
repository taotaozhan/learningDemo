package com.example.ehcachecache;

import com.example.ehcachecache.entity.Student;
import com.example.ehcachecache.service.StudentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author zhangtao
 * @date 2019/12/3
 */
@EnableCaching
@SpringBootApplication
public class EhcachecacheApplication {


  @Autowired
  private StudentService studentService;

  public static void main(String[] args) {
    SpringApplication.run(EhcachecacheApplication.class, args);
  }
}
