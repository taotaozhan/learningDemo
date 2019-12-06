package com.example.ehcachecache.controller;

import com.example.ehcachecache.entity.Student;
import com.example.ehcachecache.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangtao
 * @date 创建时间 2019/12/4
 */

@RestController
public class StudentController {

  @Autowired
  private StudentService studentService;

  @RequestMapping(value = "select",method = RequestMethod.GET)
  public Student queryStudentBySno(String sno){
    return  studentService.queryStudentBySno(sno);
  }

}
