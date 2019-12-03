package com.example.dao;

import com.example.entity.TestUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * @author zhangtao
 * @date 2019/10/9
 * @deprecated 实体类 testuser
 */


public interface UserDao extends JpaRepository<TestUser,Object> {


    /**
     * @param id
     * @return
     */
    TestUser findById(int id);

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
