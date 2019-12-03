package com.example.morejdbctemplatedruid.controller;

import com.example.morejdbctemplatedruid.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author zhangtao
 * @version 创建时间 2019/11/5
 */
@RestController
public class StudentController {

  @Autowired
  private StudentService studentService;

  @RequestMapping("/querystudentsfrommysql2")
  public List<Map<String, Object>> queryStudentsFromOracle() {
    return this.studentService.getAllStudentsFromMysql2();
  }


  @RequestMapping("/querystudentsfrommysql1")
  public List<Map<String, Object>> queryStudentsFromMysql() {
    return this.studentService.getAllStudentsFromMysql1();
  }


}
