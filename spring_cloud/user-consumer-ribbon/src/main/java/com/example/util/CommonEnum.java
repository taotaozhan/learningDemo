package com.example.util;

import org.omg.PortableInterceptor.SUCCESSFUL;

/**
 * @author zhangtao
 * @date 2019/10/22
 */
public enum CommonEnum {

  /**
   *
   */
  SUCESS("0", "sucess"),

  FAIl("1", "system error");


  private String code;
  private String message;

  public String getCode() {
    return code;
  }


  public String getMessage() {
    return message;
  }


  CommonEnum(String code, String message) {
    this.code = code;
    this.message = message;
  }


}
