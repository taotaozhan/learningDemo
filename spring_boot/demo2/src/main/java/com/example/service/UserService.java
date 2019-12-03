package com.example.service;

import com.example.entity.User;

import java.util.List;


public interface UserService {

    /**
     * 新增用户
     * @param user
     * @return
     */
    boolean addUser(User user);

    /**
     * 更新用户
     * @param user
     * @return
     */
   boolean updateUser(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
   boolean deleteUser(int id);

    /**\
     * 通过名字查询
     * @param userName
     * @return
     */
   User findUserByName(String userName);
    /**
     * 查询所有
     * @return
     */
   List<User> findAll();

}
