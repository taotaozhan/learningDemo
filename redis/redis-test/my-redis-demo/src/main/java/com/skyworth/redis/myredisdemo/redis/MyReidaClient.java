package com.skyworth.redis.myredisdemo.redis;

import redis.clients.jedis.Jedis;

import java.io.IOException;

public class MyReidaClient {
    /**
     * *3
     * $3
     * SET
     * $5
     * hello
     * $15
     * Jedis And Redis
     */
    public static void main(String[] args) throws IOException {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.set("hello","Jedis And Redis");

    }
}
