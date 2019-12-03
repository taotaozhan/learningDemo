package com.skyworth.redis.myredisdemo.redis;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class RedisTest {
    public static void main(String[] args) throws IOException {


        //监听端口
        ServerSocket redisServer = new ServerSocket();

        //接受请求
        redisServer.bind(new InetSocketAddress("127.0.0.1",6379));
        System.out.println("Redis 服务启动成功。。。。。");
        Socket connect = redisServer.accept();
        //获取内容
        InputStream inputStream = connect.getInputStream();
        //读取内容
        byte[] request = new byte[1024];
        inputStream.read(request);
        String requestString = new String(request);
        System.out.println(requestString);
    }
}
