package com.example.interceptor;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhangtao
 * @date 2019/10/17
 */
@Component
public class CommonInterceptor extends HandlerInterceptorAdapter {

  Logger logger = Logger.getLogger(CommonInterceptor.class);

  public void preHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    logger.info("请求ip：" + request.getRemoteAddr());
    logger.info("请求的方法：" + request.getMethod());
    ModelMap modelMap = modelAndView.getModelMap();
    modelMap.addAttribute("title", "zhangtao");
  }


}
