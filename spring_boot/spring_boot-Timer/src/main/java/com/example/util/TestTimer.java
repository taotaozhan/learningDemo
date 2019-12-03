package com.example.util;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author zhangtao
 * @date 2019/10/17
 * @deprecated
 */
@Component
public class TestTimer {

  @Scheduled(cron = "0/1 * * * * ?")
  public void test() {
    System.out.println("执行任务的时间是" + new Date());
  }


}
