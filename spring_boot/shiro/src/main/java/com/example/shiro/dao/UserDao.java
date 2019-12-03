package com.example.shiro.dao;

import com.example.shiro.eneity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author zhangtao
 * @date 2019/11/2
 */
@Mapper
@Repository
public interface UserDao {

  @Select(" select * from t_user where username = #{userName}")
  User findByUsername(String username);


}
