package com.example.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.ErrorListener;

/**
 * @author zhangtao
 * @date 2019/10/17
 */
@RestController
public class CommonErrorController implements ErrorController {

  private final String ERROR_PATH = "/error";

  @Override
  public String getErrorPath() {
    return ERROR_PATH;
  }


  @RequestMapping(value = ERROR_PATH)
  public String handleError() {
    return "error";
  }


}
