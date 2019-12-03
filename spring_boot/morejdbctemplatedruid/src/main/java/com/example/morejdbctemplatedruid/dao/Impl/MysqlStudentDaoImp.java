package com.example.morejdbctemplatedruid.dao.Impl;

import com.example.morejdbctemplatedruid.dao.MysqlStudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author zhangtao
 * @version 创建时间2019/11/5
 */
@Repository
public class MysqlStudentDaoImp implements MysqlStudentDao {

  @Autowired
  @Qualifier("mysqlJdbcTemplate")
  private JdbcTemplate jdbcTemplate;

  @Override
  public List<Map<String, Object>> getAllStudentFromMysql1() {
    return this.jdbcTemplate.queryForList("select * from student");
  }


}
