package com.example.rabbitmqdemo.HelloWorld;


import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author zhangtao
 * @version 创建时间 2019/12/13
 */
public class Send {

  public final static String QUEUE_NAME = "hello";
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
    // queueDeclare(String queue, boolean durable, boolean exclusive, boolean autoDelete, Map<String, Object> arguments)
    // 参数1 queue ：队列名
    // 参数2 durable ：是否持久化
    // 参数3 exclusive ：仅创建者可以使用的私有队列，断开后自动删除
    // 参数4 autoDelete : 当所有消费客户端连接断开后，是否自动删除队列
    // 参数5 arguments
    channel.queueDeclare(QUEUE_NAME,false,false,false,null);
    //发送消息
    String message = "Hello World";

    channel.basicPublish("",QUEUE_NAME,null,message.getBytes());
    System.out.println(" [x] Sent '" + message + "'");
    //关闭频道和连接
    channel.close();
    connection.close();
  }
}
