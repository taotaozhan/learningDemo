package com.example.rabbitmqdemo.workqueue;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 *
 */
public class AckWorker {

  private final  static  String QUEUE_NAME = "hello";

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
    channel.queueDeclare(QUEUE_NAME,false,false,false,null);
    //创建队列消费者
    final Consumer consumer = new DefaultConsumer(channel) {

@Override
      public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
        String message = new String(body,"UTF-8");
        System.out.println("[x] Received '" + message + "'");
        try {
          doWork(message);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }finally {
          // 每次处理完成一个消息后，手动发送一次应答。
          channel.basicAck(envelope.getDeliveryTag(), false);
        }
      }
    }


;

// acknowledgment is covered below
    boolean autoAck = false;

channel.basicConsume(QUEUE_NAME, autoAck, consumer);
  }
  private static void doWork(String task) throws InterruptedException{
    String[] taskArr = task.split(":");
    TimeUnit.SECONDS.sleep(Long.valueOf(taskArr[1]));
  }

}


