package com.example.morejdbctemplatedruid.service;

import java.util.List;
import java.util.Map;

/**
 * @author zhangtao
 * @version 创建时间 2019/11/5
 */
public interface StudentService {

  /**
   * 从mysql1数据库查询所有学生
   *
   * @return
   */
  List<Map<String, Object>> getAllStudentsFromMysql1();


  /**
   * 从mysql2数据库查询所有的学生
   *
   * @return
   */
  List<Map<String, Object>> getAllStudentsFromMysql2();


}
