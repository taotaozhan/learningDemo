package com.example.mongodbdemo.service.serviceImpl;

import com.example.mongodbdemo.entity.User;
import com.example.mongodbdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *数据库CRUD方法
 * @author zhangtao
 * @since
 */
@Component("userService")
public class UserServiceImpl implements UserService {

  @Autowired
  private MongoTemplate mongoTemplate;

  @Override
  public void saveUser(User user) {
    mongoTemplate.save(user);
  }

  @Override
  public User findUserByName(String name) {
    return  mongoTemplate.findOne(new Query(Criteria.where("name").is(name)),User.class);
  }

  @Override
  public void removeUser(String name) {
  mongoTemplate.remove(new Query(Criteria.where("name").is(name)),User.class);
  }
  @Override
  public void updateUser(String name, String key, String value) {
  mongoTemplate.updateFirst(new Query(Criteria.where("name").is(name)), Update.update(key,value),User.class);
  }

  @Override
  public List<User> listUser() {
    return mongoTemplate.findAll(User.class);
  }
}
