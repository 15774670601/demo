package com.example.demo.dao;


import com.example.demo.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface StudentDao {
    @Select("select * from student where number=#{number} and password =#{password};")
    Student findStudentByStudent(Student student);
}
