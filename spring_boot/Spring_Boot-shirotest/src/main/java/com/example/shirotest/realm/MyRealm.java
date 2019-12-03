package com.example.shirotest.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class MyRealm extends AuthorizingRealm {

  @Override
  protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
    String username = (String) authenticationToken.getPrincipal();
    if ( !"javaboy".equals(username)) {
      throw new UnknownAccountException("账户不存在");
    }
    return  new SimpleAuthenticationInfo(username,"123",getName());
  }

  @Override
  protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection){

    return null;
  }
}
