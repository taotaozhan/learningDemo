package com.example.controller;

import com.example.eneity.TestUser;
import com.example.service.TestUserService;
import org.apache.ibatis.io.ResolverUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangtao
 * @data 2019/10/10
 * 控制层类
 */

@RestController
public class TestUserController {

    @Autowired
    private TestUserService testUserService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public boolean addTestUser(TestUser testUser){
        return testUserService.addTestUser(testUser);
    }
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public  String deleteTestUser(int id){
        return testUserService.deleteTestUser(id);
    }
}
