package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangtao
 * @date 2019/10/19
 */
@Controller
public class TestController {

  @RequestMapping("/test")
  public String test(ModelMap modelMap) {

    modelMap.addAttribute("msg", "asfdasafdas");
    return "free";
  }


}
