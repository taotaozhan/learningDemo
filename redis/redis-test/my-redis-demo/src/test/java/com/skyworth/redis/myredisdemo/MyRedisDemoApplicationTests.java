package com.skyworth.redis.myredisdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyRedisDemoApplicationTests {

    @Autowired
    private StringRedisTemplate redisTemplate;
    @Test
    public void contextLoads() {
    }
    @Test
    public void redisTest() {
        redisTemplate.opsForValue().set("hello","redis");
        String hello = redisTemplate.opsForValue().get("hello");
        System.out.println(hello);
    }

    @Test
    public void jedisTest(){
        Jedis jedis = new Jedis("192.168.174.128",6379);
        jedis.set("hello","Jedis And Redis");
    }

}
