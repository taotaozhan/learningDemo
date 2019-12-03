package com.example.redissession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author zhangtao
 * @date 创建时间 2019/11/29
 */
@EnableScheduling
@SpringBootApplication
public class RedissessionApplication {

  public static void main(String[] args) {
    SpringApplication.run(RedissessionApplication.class, args);
  }


}
