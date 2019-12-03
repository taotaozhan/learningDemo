package com.example.template.service.serviceImpl;

import com.example.template.dao.StudentDao;
import com.example.template.pojo.Student;
import com.example.template.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author zhangtao
 * @version 创建时间 2019/11/4
 */
@Service
public class StudentServiceImp implements StudentService {

  @Autowired
  private StudentDao studentDao;

  @Override
  public int add(Student student) {
    return studentDao.add(student);
  }


  @Override
  public int update(Student student) {
    return studentDao.update(student);
  }


  @Override
  public int deleteBySno(String sno) {
    return studentDao.deleteBySno(sno);
  }


  @Override
  public List<Map<String, Object>> queryStudentListMap() {
    return studentDao.queryStudentListMap();
  }


  @Override
  public Student queryStudent(String sno) {
    return studentDao.queryStudent(sno);
  }


}
