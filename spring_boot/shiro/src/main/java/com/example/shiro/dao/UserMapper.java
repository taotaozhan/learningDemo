package com.example.shiro.dao;

import com.example.shiro.eneity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

  User findByUserName(String userName);


}
