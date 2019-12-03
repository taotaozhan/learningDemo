package com.example.config;



import com.example.util.RedisConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author zhagntao
 * @date 2019/10/8
 *  redis配置类
 */

    @Configuration
    public class RedisConfig {


        /**
         * @param redisConnectionFactory
         * @return 自定义redisTemplate，自带的bean没有序列化器
         */
        @Bean
        public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
            RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();

            //设置key的序列化器
            redisTemplate.setKeySerializer(new StringRedisSerializer());
            //设置值的序列化器
            redisTemplate.setValueSerializer(new RedisConverter());

            redisTemplate.setHashKeySerializer(new StringRedisSerializer());
            redisTemplate.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());

            // 开启事务
            redisTemplate.setEnableTransactionSupport(true);
            redisTemplate.setConnectionFactory(redisConnectionFactory);
            //如果不配置Serializer，那么存储的时候缺省使用String，如果用User类型存储，那么会提示错误User can't cast to String！



            return redisTemplate;
        }


}
