package com.example.controller;

import com.example.entity.User;
import com.example.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangtao
 * @date 2019/10/22
 */
@RestController
public class UserController {

  @Autowired
  private UserServiceImp userServiceImp;

  @RequestMapping(value = "/getUser", method = RequestMethod.GET)
  public User getUser(String username) {
    return userServiceImp.getUser(username);
  }


}
