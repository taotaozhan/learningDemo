package com.example.shiroauthorization.dao;

import com.example.shiroauthorization.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhangtao
 * @version 创建时间 2019/12/9
 */
@Mapper
@Repository
public interface RoleMapper {

  @Select("select r.id,r.name,r.memo from t_role r" +
      "left join t_user_role ur on(r.id = ur.rid) " +
      "left join t_user u on(u.id = ur.user_id)" +
      "where u.username = #{userName}")
   List<Role> findByUserName(String username);

}
