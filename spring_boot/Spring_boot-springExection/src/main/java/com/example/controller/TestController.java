package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author zhangtao
 * @date 2019/10/17
 */
@RestController
public class TestController {

  @RequestMapping("/test1")
  public String test1() {
    return "返回正确";
  }


  @RequestMapping("/test2")
  public String test2() {
    Map map = null;
    return map.toString();
  }


}
