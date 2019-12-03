package com.skyworth.redis.myredisdemo.redis;

import redis.clients.jedis.Jedis;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class RedisClient {
    private InputStream reader;
    private OutputStream write;
    public RedisClient(String host, int port) throws IOException {
        Socket socket = new Socket(host,port);
        write = socket.getOutputStream();
        reader = socket.getInputStream();
    }

    /**
     * *3
     * $3
     * SET
     * $5
     * hello
     * $15
     * Jedis And Redis
     * @param key
     * @param value
     */
    public String set(String key, String value) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("*3").append("\r\n");
        sb.append("$3").append("\r\n");
        sb.append("SET").append("\r\n");
        sb.append("$").append(key.getBytes().length).append("\r\n");
        sb.append(key).append("\r\n");
        sb.append("$").append(value.getBytes().length).append("\r\n");
        sb.append(value).append("\r\n");

        write.write(sb.toString().getBytes());
        byte[] response = new byte[1024];
        reader.read(response);
        return response.toString();

    }
    public static void main(String[] args) throws IOException {
//        Jedis jedis = new Jedis("127.0.0.1",6379);
//        jedis.set("hello","Jedis And Redis");

        RedisClient myRedisClient = new RedisClient("127.0.0.1",6379);
        String result = myRedisClient.set("hello","jia you qian jin !!!!");
        System.out.println(result);
    }
}
