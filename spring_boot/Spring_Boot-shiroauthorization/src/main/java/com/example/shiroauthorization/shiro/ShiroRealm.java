package com.example.shiroauthorization.shiro;


import com.example.shiroauthorization.dao.UserMapper;
import com.example.shiroauthorization.entity.User;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author zhangtao
 * @date 创建时间 2019/12/6
 */
public class ShiroRealm extends AuthorizingRealm {


  @Autowired
  private UserMapper userMapper;
  /**
   * 登录认证
   * @param token
   * @return
   * @throws AuthenticationException
   */
  @Override
  protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

    String username = (String) token.getPrincipal();
    String password = new String((char[]) token.getCredentials());


    User user = userMapper.findUserByUsername(username);
    System.out.println(user.getPassword()+"  "+user.getUsername());
    if (user == null) {
      throw new UnknownAccountException("用户名或密码错误！");
    }
    if (!password.equals(user.getPassword())) {
      throw new IncorrectCredentialsException("sdf用户名或密码错误！");
    }
    if (user.getStatus().equals("0")) {
      throw new LockedAccountException("账号已被锁定,请联系管理员！");
    }
    SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, password, getName());
    return info;
  }

  /**
   * 获取用户权限和角色
   * @param principalCollection
   * @return
   */
  @Override
  protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
    return null;
  }
}
