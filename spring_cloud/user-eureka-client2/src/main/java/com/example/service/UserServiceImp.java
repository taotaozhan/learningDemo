package com.example.service;

import com.example.dao.UserDao;
import com.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangtao
 * @date 2019/10/23
 */
@Service
public class UserServiceImp implements UserService {

  @Autowired
  private UserDao userDao;

  @Override
  public User getUser(String username) {
    return userDao.getUser(username);
  }


}
