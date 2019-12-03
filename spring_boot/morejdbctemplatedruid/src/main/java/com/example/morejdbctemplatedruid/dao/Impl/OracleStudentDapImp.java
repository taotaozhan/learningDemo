package com.example.morejdbctemplatedruid.dao.Impl;

import com.example.morejdbctemplatedruid.dao.OracleStudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author zhangtao
 * @version 创建时间 2019/11/5
 */
@Repository
public class OracleStudentDapImp implements OracleStudentDao {

  @Autowired
  @Qualifier("oracleJdbcTemplate")
  private JdbcTemplate jdbcTemplate;

  @Override
  public List<Map<String, Object>> getAllStudentFromMysql2() {
    return this.jdbcTemplate.queryForList("select * from student");
  }


}
