package com.example.controller;


import com.example.eneity.TestUser;
import com.example.service.ServiceImp.TestUserRedisServiceImp;
import com.example.service.TestUserRedisService;
import org.apache.ibatis.io.ResolverUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhangtao
 * @date 2019/10/11
 *  控制类
 */

@RestController
@RequestMapping("/redis")
public class RedisTemplateController {

    @Autowired
    private TestUserRedisServiceImp testUserRedisServiceImp;

    @GetMapping("/add")
    public boolean add1(){
        return testUserRedisServiceImp.addTestString();
    }


    @GetMapping("/addTestUser")
    public boolean add(){
        return testUserRedisServiceImp.addTestUser();
    }


    @GetMapping("/delete")
    public String delete(){
        return testUserRedisServiceImp.deleteTestUser();
    }

//    public String add(){
//        stringRedisTemplate.opsForValue().set(redisKey,"啥也不是");
//
//        TestUser testUser = new TestUser();
//        testUser.setId(5);
//        testUser.setName("啥姓子");
//        testUser.setAge(11);
//        testUser.setPassword("9839842kf");
//
//        redisTemplate.opsForValue().set(test,testUser);
//        return "啥也不是就成功了";
//    }
//    @GetMapping("/getUser")
//    public TestUser getTestUser(){
//        TestUser testUser=(TestUser) redisTemplate.opsForValue().get(test);
//        return testUser;
//    }
//    @GetMapping("/delete")
//    public String deleteTestUser(){
//        redisTemplate.delete(test);
//        return "成功删除";
//    }
}
