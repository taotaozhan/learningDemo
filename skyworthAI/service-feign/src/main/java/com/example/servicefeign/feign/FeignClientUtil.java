package com.example.servicefeign.feign;


import com.example.servicefeign.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhagntao
 * @version 创建时间 2019/11/7
 */

@FeignClient(value = "user-eureka-client")
public interface FeignClientUtil {

  /**
   *查询学生
   * @param username
   * @return
   */
  @RequestMapping(value = "/getUser",method = RequestMethod.GET)
  User getAllUser(@RequestParam(value = "username") String username);

}
