package com.example.shirotest1.realm;


import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;


/**
 * @author zhangtao
 * @date 创建时间 2019/11/21
 * @version 1.0
 */
public class MyRealm extends AuthorizingRealm {

  /**
   * 登录认证操作
   * @param authenticationToken
   * @return
   * @throws AuthenticationException
   */
  @Override
  protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
    String username = (String) authenticationToken.getPrincipal();
    if (!"javaboy".equals(username) ) {
      return (AuthenticationInfo) new UnknownAccountException("账户不存在");
    }
    return new SimpleAuthenticationInfo(username,"123",getName());
  }

  /**
   * 授权操作
   * @param principalCollection
   * @return
   */
  @Override
  protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
    return null;
  }
}
