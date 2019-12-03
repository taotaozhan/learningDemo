package com.example.morejdbctemplatedruid.service.Impl;

import com.example.morejdbctemplatedruid.dao.MysqlStudentDao;
import com.example.morejdbctemplatedruid.dao.OracleStudentDao;
import com.example.morejdbctemplatedruid.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@Repository
public class StudentserviceImp implements StudentService {

  @Autowired
  private MysqlStudentDao mysqlStudentDao;
  @Autowired
  private OracleStudentDao oracleStudentDao;

  @Override
  public List<Map<String, Object>> getAllStudentsFromMysql2() {
    return oracleStudentDao.getAllStudentFromMysql2();
  }


  @Override
  public List<Map<String, Object>> getAllStudentsFromMysql1() {
    return mysqlStudentDao.getAllStudentFromMysql1();
  }


}
