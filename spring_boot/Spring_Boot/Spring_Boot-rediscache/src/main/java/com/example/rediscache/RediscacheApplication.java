package com.example.rediscache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author zhangtao
 * @date 创建时间  2019/12/4
 */

@EnableCaching
@SpringBootApplication
public class RediscacheApplication {

  public static void main(String[] args) {
    SpringApplication.run(RediscacheApplication.class, args);
  }
}
