package com.example.util;

import lombok.Getter;
import lombok.Setter;

/**
 * @author zhangtao
 * @date 2019/10/22
 */
@Getter
@Setter

public class CommonResult<T> {

  public String code;
  public String message;
  public T data;

  public CommonResult(String code, String message) {
    this.code = code;
    this.message = message;
  }


  public CommonResult(String code, String message, T data) {
    this.code = code;
    this.message = message;
    this.data = data;
  }


  public CommonResult() {
  }


  public static CommonResult success(String code, String message, Object data) {
    return new CommonResult(code, message, data);
  }


  public static CommonResult fail(String code, String message) {
    return new CommonResult(code, message);
  }


}
