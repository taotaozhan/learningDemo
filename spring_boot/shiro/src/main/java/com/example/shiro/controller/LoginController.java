package com.example.shiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhangtao
 * @date 2019/11/2
 */
@Controller
public class LoginController {

  @GetMapping("/login")
  public String login() {
    return "login";
  }


}
