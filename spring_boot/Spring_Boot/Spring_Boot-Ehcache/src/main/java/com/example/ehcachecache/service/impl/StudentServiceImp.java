package com.example.ehcachecache.service.impl;

import com.example.ehcachecache.entity.Student;
import com.example.ehcachecache.mapper.StudentMapper;
import com.example.ehcachecache.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author zhangtao
 * @date 创建时间 2019/12/3
 */

@Repository("studentService")
public class StudentServiceImp implements StudentService {
  @Autowired
  private StudentMapper studentMapper;

  @Override
  public Student update(Student student) {
    this.studentMapper.updateStudent(student);
    return this.studentMapper.queryStudentBySno(student.getSno());
  }

  @Override
  public void deleteStudentBySno(String sno) {
    this.studentMapper.deltetStudent(sno);
  }

  @Override
  public Student queryStudentBySno(String sno) {
    return this.studentMapper.queryStudentBySno(sno);
  }
}
