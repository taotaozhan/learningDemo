package com.example.mongodbdemo;

import com.example.mongodbdemo.entity.User;
import com.example.mongodbdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

/**
 * @author zhangtao
 * @data  创建时间 2019/11/19
 * @version 1.0
 */
@SpringBootApplication
public class MongodbdemoApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(MongodbdemoApplication.class, args);
  }

  @Autowired
  private UserService userService;
  @Override
  public void run(String... args) throws Exception {
    try {
      User user = new User("1", "小明", 10);
      user.setAddress("青岛市");
      userService.saveUser(user);
      List<User> list = userService.listUser();
      System.out.println("一共这么多人:"+list.size());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
