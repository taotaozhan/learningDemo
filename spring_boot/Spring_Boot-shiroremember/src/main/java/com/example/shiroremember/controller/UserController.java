package com.example.shiroremember.controller;

import com.example.shiroremember.dao.ResponseBo;
import com.example.shiroremember.entity.User;
import com.example.shiroremember.util.Md5Util;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhangtao
 * @date 创建时间 2019/12/6
 */
@Controller
public class UserController {

  @GetMapping("/login")
  public String login() {
    return "login";
  }

  @PostMapping("/login")
  @ResponseBody
  public ResponseBo login(String username, String password,Boolean rememberMe) {
    // 密码MD5加密
    rememberMe = true;
    password = Md5Util.encrypt(username, password);
    UsernamePasswordToken token = new UsernamePasswordToken(username, password,rememberMe);
    // 获取Subject对象
    Subject subject = SecurityUtils.getSubject();
    try {
      subject.login(token);
      return ResponseBo.ok();
    } catch (UnknownAccountException e) {
      return ResponseBo.error(e.getMessage());
    } catch (IncorrectCredentialsException e) {
      return ResponseBo.error(e.getMessage());
    } catch (LockedAccountException e) {
      return ResponseBo.error(e.getMessage());
    } catch (AuthenticationException e) {
      return ResponseBo.error("认证失败！");
    }
  }

  @RequestMapping("/")
  public String redirectIndex() {
    return "redirect:/index";
  }

  @RequestMapping("/index")
  public String index(Model model) {
    // 登录成后，即可通过Subject获取登录的用户信息
    User user = (User) SecurityUtils.getSubject().getPrincipal();
    model.addAttribute("user", user);
    return "index";
  }
}
