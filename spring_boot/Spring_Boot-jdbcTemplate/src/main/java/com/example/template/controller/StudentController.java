package com.example.template.controller;

import com.example.template.pojo.Student;
import com.example.template.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author zhangtao
 * @version 创建时间 2019/11/4
 */
@RestController
public class StudentController {

  @Autowired
  private StudentService studentService;

  /**
   * 增加方法
   *
   * @param sno
   * @param sname
   * @param ssex
   * @return
   */
  @RequestMapping(value = "/addstudent", method = RequestMethod.GET)
  public int saveStudent(String sno, String sname, String ssex) {
    Student student = new Student();
    student.setSno(sno);
    student.setSname(sname);
    student.setSsex(ssex);
    return this.studentService.add(student);
  }


  /**
   * 查询所有的学生
   *
   * @return
   */
  @RequestMapping(value = "/queryallstudent")
  public List<Map<String, Object>> queryAllStudent() {
    return this.studentService.queryStudentListMap();
  }


  /**
   * 更新学生信息
   *
   * @param sno
   * @param sname
   * @param ssex
   * @return
   */
  @RequestMapping(value = "/update")
  public int update(String sno, String sname, String ssex) {
    Student student = new Student();
    student.setSno(sno);
    student.setSname(sname);
    student.setSsex(ssex);
    return this.studentService.update(student);
  }


  @RequestMapping(value = "/deleteBySno")
  public int deleteBySno(String sno) {
    return this.studentService.deleteBySno(sno);
  }


  /**
   * 根据学号查询学生
   *
   * @param sno
   * @return
   */
  @RequestMapping(value = "/querystudent", method = RequestMethod.GET)
  public Student queryStudentBySno(String sno) {
    return this.studentService.queryStudent(sno);

  }


}
