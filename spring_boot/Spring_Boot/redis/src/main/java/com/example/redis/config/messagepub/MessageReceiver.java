package com.example.redis.config.messagepub;

import org.springframework.stereotype.Component;

/**
 * @author zhangtao
 * @date 创建时间 2019/11/27
 */
@Component
public class MessageReceiver {
  /**接收消息的方法*/
  public void receiveMessage(String message){
    System.out.println("收到一条消息："+message);
  }

}
