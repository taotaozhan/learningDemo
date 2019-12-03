package com.springboot.service;

import com.springboot.entity.User;

import java.util.List;

public interface UserService {
    User save(User user);

    User findById(String id);

    void delete(User user);

    List<User> findAll();
}
