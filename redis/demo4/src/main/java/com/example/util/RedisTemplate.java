package com.example.util;

import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.jedis.JedisConnection;



/**
 * @author zhagntao
 * @date 2019/10/9
 *重写RedisTemplate类  进行分库储存
 */


public class RedisTemplate extends org.springframework.data.redis.core.RedisTemplate {


      private static ThreadLocal<Integer>  indexdb = new ThreadLocal<Integer>(){
          @Override
          protected Integer initialValue() {
              return 0;
          }
      };

    @Override
    protected RedisConnection preProcessConnection(RedisConnection connection, boolean existingConnection) {
        try {
            Integer dbIndex = indexdb.get();
            if(dbIndex !=  null){
               if(connection instanceof JedisConnection){

               }else {
                   connection.select(dbIndex);
               }
            }else {

                connection.select(0);
            }
            }finally {
           indexdb.remove();
        }
        return super.preProcessConnection(connection, existingConnection);
    }
}
