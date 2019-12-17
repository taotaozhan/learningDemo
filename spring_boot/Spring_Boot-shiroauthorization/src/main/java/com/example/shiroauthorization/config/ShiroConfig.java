package com.example.shiroauthorization.config;


import com.example.shiroauthorization.shiro.ShiroRealm;
import org.apache.shiro.codec.Base64;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;

/**
 * @author zhangtao
 * @date 创建时间 2019/12/6
 */
@Configuration
public class ShiroConfig {

  @Bean
  public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager){
    ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
    //设置securityManager
    shiroFilterFactoryBean.setSecurityManager(securityManager);
    //登录的URL
    shiroFilterFactoryBean.setLoginUrl("/login");
    //登陆成功后跳转的URL
    shiroFilterFactoryBean.setSuccessUrl("/index");
    //未授权URL
    shiroFilterFactoryBean.setUnauthorizedUrl("/403");

    LinkedHashMap<String,String> filterChainDefinifMap = new LinkedHashMap<>();
    //定义filterChain ，平台资源不拦截
    filterChainDefinifMap.put("/css/**","anon");
    filterChainDefinifMap.put("/js/**","anon");
    filterChainDefinifMap.put("/img/**","anon");
    //druid数据源监控页面不拦截
    filterChainDefinifMap.put("/druid/**","anon");
    //除上以外所有URL都必须认证通过才可以访问，未通过认证自动访问LoginURL
    filterChainDefinifMap.put("/**","user");
    shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinifMap);

    return shiroFilterFactoryBean;
  }

  @Bean
  public SecurityManager securityManager(){
    //配置SecurityManager，并注入shiroRealm
    DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
    securityManager.setRealm(shiroRealm());
    securityManager.setRememberMeManager(rememberMeManager());
    return securityManager;
  }

  @Bean
  public ShiroRealm shiroRealm(){
    //配置Realm ，
    ShiroRealm shiroRealm = new ShiroRealm();
    return shiroRealm;
  }

  public SimpleCookie rememberMeCookie(){
    //设置cookie名称，
    SimpleCookie cookie = new SimpleCookie("remember");
    cookie.setMaxAge(86400);
    return  cookie;
  }
  /**
   * cookie管理对象
   * @return
   */
  public CookieRememberMeManager rememberMeManager(){
    CookieRememberMeManager cookieRememberMeManager =new CookieRememberMeManager();
    cookieRememberMeManager.setCookie(rememberMeCookie());
    cookieRememberMeManager.setCipherKey(Base64.decode("4AvVhmFLUs0KTA3Kprsdag=="));
    return cookieRememberMeManager;
  }
}
