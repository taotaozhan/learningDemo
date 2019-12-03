package com.example;

import com.example.interceptor.CommonInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author zhangtao
 * @date 2019/10/17
 */
@SpringBootApplication
public class DemoApplication extends WebMvcConfigurerAdapter {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @Autowired
  private CommonInterceptor commonInterceptor;

  @Override
  public void addInterceptors(InterceptorRegistry registry) {


    registry.addInterceptor(commonInterceptor);

//    //登录拦截的管理器
//    InterceptorRegistration  registration = registry.addInterceptor(new CommonInterceptor());
//    //拦截所有路径
//    registration.addPathPatterns("/");
//    //添加不拦截路径
//    registration.excludePathPatterns("/text");
  }


}
