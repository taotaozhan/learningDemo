package com.example.ehcachecache.mapper;

import com.example.ehcachecache.entity.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @author zhangtao
 * @date 2019/12/3
 */

@Mapper
public interface StudentMapper {

  @Update("update student set sname = #{sname},ssex=#{ssex},where sno = #{sno}")
  int updateStudent(Student student);

  @Delete("deltet from student where sno = #{sno}")
  void deltetStudent(String sno);

  @Select("select * from student where sno =#{sno}")
  Student queryStudentBySno(String sno);




}
