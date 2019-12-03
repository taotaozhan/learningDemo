package com.example.mongodbdemo.service;

import com.example.mongodbdemo.entity.User;

import java.util.List;

/**
 * @author zhangtao
 * @date 创建时间2019/11/19
 * @version 1.0
 */
public interface UserService {
  void saveUser(User user);
  User findUserByName(String name);
  void removeUser(String name);
  void updateUser(String name,String key,String value);
  List<User> listUser();
}
