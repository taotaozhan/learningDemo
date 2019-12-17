package com.example.rabbitmqdemo.workqueue;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author zhangtao
 * @version 创建时间 2019/12/17
 */

public class AckNewTask {

  private final static String QUEUE_NAME = "hello";

  public static void main(String[] args) throws IOException, TimeoutException {
    //创建连接
    ConnectionFactory factory = new ConnectionFactory();
    //设置RabbitMQ的主机名
    factory.setHost("localhost");
    //创建一个连接
    Connection connection = factory.newConnection();
    //创建一个通道
    Channel channel = connection.createChannel();
    //指定一个队列
    channel.queueDeclare(QUEUE_NAME,false,false,false, null);
    for (int i = 0; i < 10 ; i++) {
      String message = "Liang:" + i;
      channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
      System.out.println("[x] Sent '" + message + "'");
    }
    //关闭频道和链接
    channel.close();
    connection.close();
  }
}
