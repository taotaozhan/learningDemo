package com.example.service;


import com.example.entity.TestUser;

import java.util.List;

/**
 * @author zhangtao
 * @date 2019/10/9
 * @deprecated
 */

public interface TestUserService {


    List<TestUser> findAll();
    /**
     * @param id
     * @return
     */
     TestUser findByid(int id);

    /**
     * @param name
     * @param age
     * @return
     */
     List<TestUser> findByNameAndAge(String name,int age);

    /**
     * @param name
     * @return
     */
     TestUser findByName(String name);

}
