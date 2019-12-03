package com.example.template.dao.Impl;

import com.example.template.dao.StudentDao;
import com.example.template.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;


import java.sql.Types;
import java.util.List;
import java.util.Map;

/**
 * @author zhangtao
 * @version 创建时间 2019/11/4
 */
@Repository
public class StudentDaoImp implements StudentDao {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  @Override
  public int add(Student student) {
    String sql = "insert into student(sno,sname,ssex) values(:sno,:sname,:ssex)";
    NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(this.jdbcTemplate.getDataSource());
    return npjt.update(sql, new BeanPropertySqlParameterSource(student));
  }


  @Override
  public int update(Student student) {
    String sql = "update student set sname = ?,ssex = ? where sno = ?";
    Object[] args = {student.getSname(), student.getSsex(), student.getSno()};
    int[] argTypes = {Types.VARCHAR, Types.VARCHAR, Types.VARCHAR};
    return this.jdbcTemplate.update(sql, args, argTypes);
  }


  @Override
  public int deleteBySno(String sno) {
    String sql = "delete from student where sno = ?";
    Object[] args = {sno};
    int[] argTypes = {Types.VARCHAR};
    return jdbcTemplate.update(sql, args, argTypes);
  }


  @Override
  public List<Map<String, Object>> queryStudentListMap() {
    String sql = "select * from student";
    return this.jdbcTemplate.queryForList(sql);
  }


  @Override
  public Student queryStudent(String sno) {
    String sql = "select * from student where sno = ? ";

    return null;
  }


}
