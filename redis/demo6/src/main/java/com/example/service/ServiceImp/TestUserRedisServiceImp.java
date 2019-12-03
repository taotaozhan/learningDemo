package com.example.service.ServiceImp;

import com.example.base.util.RedisConstants;
import com.example.eneity.TestUser;
import com.example.service.TestUserRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author zhangtao
 * @data 2019/10/12
 * @deprecated redis实现类
 */

@Service
public class TestUserRedisServiceImp implements TestUserRedisService {

    @Autowired
   private  RedisTemplate<String,Object> redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void setRedisTemplate(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }


    @Override
    public boolean addTestString() {
        boolean flag = false;
        try {
            com.example.base.util.RedisTemplate.indexdb.set(RedisConstants.datebase2);
            stringRedisTemplate.opsForValue().set("sleep","sleep");
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean addTestUser() {
        TestUser testUser = new TestUser();
        testUser.setId(5);
        testUser.setName("wei");
        testUser.setPassword("akdf123aks");
        testUser.setAge(99);
        boolean flag = false;
        try {
            com.example.base.util.RedisTemplate.indexdb.set(RedisConstants.datebase2);
            redisTemplate.opsForValue().set("test",testUser);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public String deleteTestUser() {
        redisTemplate.delete("test");
        return "删除成功";
    }
}
