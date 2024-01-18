package com.example.BootApp.dao;

import com.example.BootApp.model.Student;
import com.example.BootApp.util.RowMapperImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudRepoImp implements StudRepo{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public Student createStudent(Student student) {
        System.out.println(student);
        String query = "insert into student (name,course, age, address) values (?,?,?,?)";
       this.jdbcTemplate.update(query,student.getName(),student.getCourse(),student.getAge(),student.getAddress());
        return student ;
    }

    @Override
    public Student select(String name) {
        String query = "select * from student where name = ?";
        RowMapperImp rowMapper = new RowMapperImp();
        Student student = this.jdbcTemplate.queryForObject(query,rowMapper,name);
        return student;
    }

    @Override
    public Student updateStudent(Student student) {
        String query = "update student set course = ?, age = ?, address = ? where name = ?";
        this.jdbcTemplate.update(query,student.getCourse(),student.getAge(),student.getAddress(),student.getName());
        return student;
    }
}
