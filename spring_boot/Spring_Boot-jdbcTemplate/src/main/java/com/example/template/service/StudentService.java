package com.example.template.service;

import com.example.template.pojo.Student;

import java.util.List;
import java.util.Map;

/**
 * @author zhangtao
 * @version 创建时间 2019/11/4
 */
public interface StudentService {

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
