package com.example.controller;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

/**
 * @author zhangtao
 * @date 2019/10/29
 */

public class ZuulQuquestFilter extends ZuulFilter {

  /**
   * 指定过滤器的类型
   * @return
   */
  @Override
  public String filterType() {
    return null;
  }

  /**
   * 过滤器顺序 数字越小越先执行
   * @return
   */
  @Override
  public int filterOrder() {
    return 0;
  }

  /**
   * 是否开启过滤器
   * @return
   */
  @Override
  public boolean shouldFilter() {
    return false;
  }

  /**
   * 过滤器具体执行的操作
   * @return
   * @throws ZuulException
   */
  @Override
  public Object run() throws ZuulException {
    return null;
  }
}
