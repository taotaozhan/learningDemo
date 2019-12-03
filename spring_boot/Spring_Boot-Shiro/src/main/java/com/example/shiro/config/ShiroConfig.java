package com.example.shiro.config;

import com.example.shiro.shiro.ShiroRealm;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;

/**
 * @author zhangtao
 * @date 2019/11/2
 */


@Configuration
public class ShiroConfig {

  @Bean
  public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager) {

    ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
    //设置securityManager
    shiroFilterFactoryBean.setSecurityManager(securityManager);
    //登录的URL
    shiroFilterFactoryBean.setLoginUrl("/login");
    //登陆成功后跳转的URL
    shiroFilterFactoryBean.setUnauthorizedUrl("/index");
    //未授权URL
    shiroFilterFactoryBean.setUnauthorizedUrl("/403");

    LinkedHashMap<String, String> filterChainDefinifMap = new LinkedHashMap<>();
    //定义filterChain，平台资源不拦截

    filterChainDefinifMap.put("/css/**", "anon");
    filterChainDefinifMap.put("/js/**", "anon");
    filterChainDefinifMap.put("/fonts/**", "anon");
    filterChainDefinifMap.put("/img/**", "anon");
    //druid数据源监控页面不拦截
    filterChainDefinifMap.put("/druid/**", "anon");
    //配置推出过滤器，其中具体的退出代码Shiro已经替我们实现
    filterChainDefinifMap.put("/logout", "logout");
    filterChainDefinifMap.put("/", "anon");
    //除上以外所有URL都必须认证通过才可以访问，未通过认证自动访问LoginURL
    filterChainDefinifMap.put("/**", "authc");
    shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinifMap);

    return shiroFilterFactoryBean;
  }


  @Bean
  public SecurityManager securityManager() {
    // 配置SecurityManager，并注入shiroRealm
    DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
    securityManager.setRealm(shiroRealm());
    return securityManager;
  }


  @Bean
  public ShiroRealm shiroRealm() {
    // 配置Realm，需自己实现
    ShiroRealm shiroRealm = new ShiroRealm();
    return shiroRealm;
  }
}
