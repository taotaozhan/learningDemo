package com.example.servicefeign.controller;

import com.example.servicefeign.entity.User;
import com.example.servicefeign.feign.FeignClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangtao
 * @version 创建时间 2019/11/7
 */

@RestController
public class FeignController {

  @Autowired
  private FeignClientUtil feignClientUtil;

  @RequestMapping(value = "/getUser",method = RequestMethod.GET)
  public User getAllUser(@RequestParam String username){
    return  feignClientUtil.getAllUser(username);
  }


}
