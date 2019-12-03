package com.skyworth.mongodb.dao;

import com.skyworth.mongodb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

/**
 * @author zhangtao
 * @date 2019/11/1
 */
@Component
public class UserDao {

  @Autowired
  private MongoTemplate mongoTemplate;

  /**
   * 创建对象
   *
   * @param userDao
   */
  public void addUser(User userDao) {
    mongoTemplate.save(userDao);
  }


  /**
   * 根据用户名查询
   *
   * @return
   */
  public User selectUser(String name) {
    Query query = new Query(Criteria.where("name").is(name));
    User user = mongoTemplate.findOne(query, User.class);
    return user;
  }


  /**
   * 更新对象
   */
  public void updataUser(User user) {
    Query query = new Query(Criteria.where("id").is(user.getId()));
    Update update = new Update().set("age", user.getAge()).set("name", user.getName());
    mongoTemplate.updateFirst(query, update, User.class);
  }


  /**
   * 删除对象
   */
  public void deleteUser(int id) {
    Query query = new Query(Criteria.where("id").is(id));
    mongoTemplate.remove(id);
  }


}
