package com.example.mybatisdruid.dao;

import com.example.mybatisdruid.entity.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author zhangtao
 * @version 创建时间2019/11/4
 */
public interface StudentDao {

  /**
   * 增加一个学生
   *
   * @param student
   * @return
   */
  @Insert("insert into student(sno,sname,ssex) values (#{sno},#{sname},#{ssex})")
  int addStudent(Student student);


  /**
   * 更新学生信息
   *
   * @param student
   * @return
   */
  @Update("update student set sname=#{sname},ssex=#{ssex} where sno =#{sno}")
  int updateStudent(Student student);


  /**
   * 删除学生信息
   *
   * @param sno
   * @return
   */
  @Delete("delete from student where sno= #{sno}")
  int deleteBySno(String sno);


  @Select("select * from student")
  List<Student> findAllStudent();


}
