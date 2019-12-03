package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author zhangtao
 * @date 2019/10/17
 * @deprecated
 */
@Controller
public class FreeMarkercontroller {

  @RequestMapping("/demo")
  public String demo(Map<String, Object> map) {
    map.put("descrip", "这是一个demo");
    return "demo";
  }


}
