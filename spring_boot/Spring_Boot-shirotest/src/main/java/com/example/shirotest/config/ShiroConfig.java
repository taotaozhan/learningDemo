package com.example.shirotest.config;

import com.example.shirotest.realm.MyRealm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author zhangtao
 * @date 创建时间2019/11/21
 * @version 1.0
 */
@Configuration
public class ShiroConfig {

  @Bean
  MyRealm myRealm(){
    return new MyRealm();
  }
  @Bean
  DefaultWebSecurityManager securityManager(){
    DefaultWebSecurityManager manager  = new DefaultWebSecurityManager();
    manager.setRealm(myRealm());
    return manager;
  }
  @Bean
  ShiroFilterFactoryBean shiroFilterFactoryBean(){
    ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
    bean.setSecurityManager(securityManager());
    bean.setLoginUrl("/login");
    bean.setSuccessUrl("/index");
    bean.setUnauthorizedUrl("/unauthorizedurl");
    Map<String,String> map = new LinkedHashMap<>();
    map.put("/doLogin","anon");
    map.put("/**","authc");
    bean.setFilterChainDefinitionMap(map);
    return bean;
  }
}
