package com.example.template.dao;

import com.example.template.pojo.Student;

import java.util.List;
import java.util.Map;

/**
 * @author zhangtao
 * @version 创建时间
 */
public interface StudentDao {

  /**
   * 添加
   *
   * @param student
   * @return
   */
  int add(Student student);


  /**
   * 更新
   *
   * @param student
   * @return
   */
  int update(Student student);


  /**
   * 根据sno删除
   *
   * @param sno
   * @return
   */
  int deleteBySno(String sno);


  /**
   * 查询所有学生
   *
   * @return
   */
  List<Map<String, Object>> queryStudentListMap();


  /**
   * 根据sno查询所有学生
   *
   * @param sno
   * @return
   */
  Student queryStudent(String sno);


}
