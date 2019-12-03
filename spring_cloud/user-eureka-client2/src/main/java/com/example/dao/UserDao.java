package com.example.dao;

import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author zhangtao
 * @date 2019/10/23
 */
@Repository
@Mapper

public interface UserDao {

  /**
   * 根据用户名称查询
   */
  @Select("SELECT id,username,password,realname from user where username = #{username}")
  User getUser(@Param("username") String username);


}
