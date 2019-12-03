package com.example.mongodbdemo.controller;

import com.example.mongodbdemo.entity.User;
import com.example.mongodbdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangtao
 * @date 创建时间2019/11/19
 * @version 1.0
 */
@RestController
public class UserContoller {

  @Autowired
  private UserService userService;

  @RequestMapping(value = "/saveUser",method = RequestMethod.POST)
  public void saveUser(User user){
    userService.saveUser(user);
  }

  //  @RequestMapping(value = "/saveUser",method = RequestMethod.POST)
//  public void saveUser(String uid ,String name,int age,String address){
//    User user = new User(uid,name,age);
//    user.setAddress(address);
//    System.out.println(user);
//    userService.saveUser(user);
//  }

}
