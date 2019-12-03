package com.example.controller;

import com.example.entity.TestUser;
import com.sun.corba.se.impl.orb.ParserTable;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @author zhangtao
 * @date 2019/10/17
 * @deprecated
 */
@RestController
public class TestUserValidatorController {

  @PostMapping("/")
  public String testDemo(@Valid TestUser testUser, BindingResult bindingResult) {
    StringBuffer stringBuffer = new StringBuffer();
    if (bindingResult.hasErrors()) {
      List<ObjectError> list = bindingResult.getAllErrors();
      for (ObjectError objectError : list) {
        stringBuffer.append(objectError.getDefaultMessage());
        stringBuffer.append("---");
      }
    }
    return stringBuffer != null ? stringBuffer.toString() : "全部正确";
  }


}
