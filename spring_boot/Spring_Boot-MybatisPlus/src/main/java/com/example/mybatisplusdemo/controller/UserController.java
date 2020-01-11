package com.example.mybatisplusdemo.controller;

import com.example.mybatisplusdemo.dao.UserMapper;
import com.example.mybatisplusdemo.eneity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangtao
 * @version 创建时间 2019/12/26
 */

@RestController
@RequestMapping("test")
public class UserController {

  @Autowired
  private UserMapper userMapper;

  /**
   * 查询数据
   */

  @RequestMapping(value = "/select",method = RequestMethod.GET)
  public User testSelectOne(){
    User user = userMapper.selectById(1L);
    System.out.println(user);
    return user;
  }

}
