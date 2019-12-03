package com.example.controller;


import com.example.entity.TestUser;
import com.example.service.TestUserService;
import com.example.service.TestUserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zhangtao
 * @date 2019/10/9
 * @deprecated 实体类 testuser
 */

@RestController
public class TestUserController {

    @Autowired
    private TestUserService testUserService;

    @RequestMapping(value = "/getAllUser",method = RequestMethod.GET)
    public List<TestUser>  getAllUser(){
             return  testUserService.findAll();
    }
    @GetMapping("/findById/{id}")
    public TestUser getTestUserById(@PathVariable("id")Integer id){
        return  testUserService.findByid(id);
    }
}
