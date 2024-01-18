package com.example.BootApp.util;

import com.example.BootApp.model.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImp implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student s = new Student();
        s.setName(rs.getString(1));
        s.setCourse(rs.getString(2));
        s.setAge(rs.getInt(3));
        s.setAddress(rs.getString(4));
        return s;
    }
}
