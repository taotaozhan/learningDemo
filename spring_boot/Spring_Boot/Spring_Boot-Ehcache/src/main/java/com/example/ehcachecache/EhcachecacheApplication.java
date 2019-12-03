package com.example.ehcachecache;

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

  public static void main(String[] args) {
    SpringApplication.run(EhcachecacheApplication.class, args);
  }
}
