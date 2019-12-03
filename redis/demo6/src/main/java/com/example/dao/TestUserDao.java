package com.example.dao;

import com.example.eneity.TestUser;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


/**
 * @author zhangtao
 * @data 2019/10/10
 * @deprecated
 */

@Component
@Repository
@Mapper
public interface TestUserDao  {


    /**
     *
     * @param testUser
     * @return String
     */
    @Insert("insert into test_user(id,name,password,age) values (#{id},#{name},#{password},#{age})")
     void addTestUser(TestUser testUser);
    /**
     * 删除
     */
    @Delete("delete from test_user where id = #{id}")
    void deleteTestUser(int id);
}
