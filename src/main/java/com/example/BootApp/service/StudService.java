package com.example.BootApp.service;

import com.example.BootApp.model.Student;

public interface StudService {
     Student createStudent(Student student);
    public Student getStudent(String name);
    public Student updateStudent(Student student);
}
