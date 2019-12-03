package com.example.shirotest1.config;

import com.example.shirotest1.realm.MyRealm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangtao
 * @date 创建时间 2019/11/21
 * @version 1.0
 */

@Configuration
public class ShiroConfig {
  @Bean
  MyRealm myRealm(){
    return  new MyRealm();
  }
  @Bean
  DefaultWebSecurityManager securityManager(){
    DefaultWebSecurityManager manager = new DefaultWebSecurityManager();
    manager.setRealm(myRealm());
    return manager;
  }
  @Bean
    DefaultShiroFilterChainDefinition shiroFilterChainDefinition(){
    DefaultShiroFilterChainDefinition definition = new DefaultShiroFilterChainDefinition();
    definition.addPathDefinition("/doLogin","anon");
    definition.addPathDefinition("/**","authc");
    return definition;

  }
}
