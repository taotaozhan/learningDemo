package com.example.service;


import com.example.dao.UserDao;
import com.example.entity.TestUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author zhangtao
 * @date 2019/10/10
 * @deprecated 实现类
 */

@Service
public class TestUserServiceImp implements TestUserService{

    @Autowired
    private UserDao userDao;


    @Override
    public List<TestUser> findAll() {
        return userDao.findAll();
    }

    @Override
    public TestUser findByid(int id) {
        return userDao.findById(id);
    }

    @Override
    public List<TestUser> findByNameAndAge(String name, int age) {
        return userDao.findByNameAndAge(name,age);
    }

    @Override
    public TestUser findByName(String name) {
        return userDao.findByName(name);
    }
}
