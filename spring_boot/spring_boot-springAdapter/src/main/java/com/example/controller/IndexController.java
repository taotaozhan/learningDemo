package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangtao
 * @date 2019/10/17
 */
@Controller
public class IndexController {

  @RequestMapping("/text")
  public String test() {
    return "不会返回";
  }


  @RequestMapping("/")
  public String index(Model model) {
    model.addAttribute("content", "hi , dalaoyang !");
    return "index";
  }


}
