package com.example.controller;

import com.example.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangtao
 * @date 2019/10/17
 * @deprecated
 */
@RestController
public class JsonAndXmlController {

  @Autowired


  @GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
  public Users index() {
    Users user = new Users(1, "26", "北京");
    return user;
  }


  @GetMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
  public Users XML() {
    Users user = new Users(2, "26", "北京");
    return user;
  }


}
