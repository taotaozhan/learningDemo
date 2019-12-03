package com.skyworth.mongodb.controller;

import com.skyworth.mongodb.dao.UserDao;
import com.skyworth.mongodb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangtao
 * @date 2019/11/1
 */
@RestController
public class UserController {

  @Autowired
  private UserDao userDao;

  @GetMapping(value = "/saveTest")
  private void saveTest() throws Exception {
    User user = new User();
    user.setId(11);
    user.setAge(34);
    user.setName("zhangtao");
    userDao.addUser(user);
  }


}
