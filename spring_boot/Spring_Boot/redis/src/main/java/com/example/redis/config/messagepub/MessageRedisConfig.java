package com.example.redis.config.messagepub;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;

/**
 * @author zhangtao
 * @data 创建时间 2019/11/27
 */
@Configuration
public class MessageRedisConfig  {
  /**
   * redis消息监听器容器
   * 可以添加多个监听不同话题的redis监听器，只需要把消息监听器和相应的消息订阅处理器绑定，该消息
   * 监听器通过反射技术调用消息订阅处理器的相关方法进行一些业务处理。
   *
   */
  @Bean
  RedisMessageListenerContainer container(RedisConnectionFactory connectionFactory, MessageListenerAdapter listenerAdapter){
    RedisMessageListenerContainer container = new RedisMessageListenerContainer();
    container.setConnectionFactory(connectionFactory);
    //订阅一个叫chat 的通道
    container.addMessageListener(listenerAdapter,new PatternTopic("chat"));
    //这个container可以添加多个messageListener
    return container;
  }

  /**
   * 消息监听器适配器，绑定消息处理器，利用反射技术调用消息处理器的业务方法
   * @param receiver
   * @return
   */
  @Bean
  MessageListenerAdapter listenerAdapter(MessageReceiver receiver) {
    //这个地方 是给messageListenerAdapter 传入一个消息接受的处理器，利用反射的方法调用“receiveMessage”
    //也有好几个重载方法，这边默认调用处理器的方法 叫handleMessage 可以自己到源码里面看
    return new MessageListenerAdapter(receiver, "receiveMessage");
  }

  /**redis 读取内容的template */
  @Bean
  StringRedisTemplate template(RedisConnectionFactory connectionFactory) {
    return new StringRedisTemplate(connectionFactory);
  }

}
