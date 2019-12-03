package com.example.asyncdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author zhangtao
 * @version 创建时间 2019/11/13
 */

@SpringBootApplication
@EnableAsync
public class AsyncdemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(AsyncdemoApplication.class, args);
  }
}
