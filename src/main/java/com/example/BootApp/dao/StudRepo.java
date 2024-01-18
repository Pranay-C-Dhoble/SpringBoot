package com.example.BootApp.dao;

import com.example.BootApp.model.Student;

public interface StudRepo {
    public Student createStudent(Student student);
    public Student select(String name);
    public Student updateStudent(Student student);
}
