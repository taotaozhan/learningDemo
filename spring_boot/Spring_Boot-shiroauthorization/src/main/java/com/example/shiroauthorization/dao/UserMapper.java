package com.example.shiroauthorization.dao;


import com.example.shiroauthorization.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author zhangtao
 * @date 创建时间 2019/12/6
 */
@Mapper
@Repository
public interface UserMapper {

  @Select("select * from t_user where username = #{username}")
  User findUserByUsername(String username);
}
