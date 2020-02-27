package com.example.rabbitmqdemo.publich;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class EmitLog {

  private final static String EXCHANGE_NAME = "log";

  public static void main(String[] args) throws IOException, TimeoutException {
    //创建连接
    ConnectionFactory factory = new ConnectionFactory();
    //设置主机名
    factory.setHost("localhost");
    //创建一个连接
    Connection connection = factory.newConnection();
    //创建一个通道
    Channel channel = connection.createChannel();
    //指定一个交换器
    channel.exchangeDeclare(EXCHANGE_NAME,"fount");
    //发送消息

  }


}
