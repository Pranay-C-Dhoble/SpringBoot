package com.example.BootApp.service;

import com.example.BootApp.dao.StudRepo;
import com.example.BootApp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudServiceImp implements StudService{
    @Autowired
    private StudRepo studRepo;
    @Override
    public Student createStudent(Student student) {
//        student.setName(student.getName().toUpperCase());
//        student.setCourse(student.getCourse().toUpperCase());
//        student.setAge(student.getAge());
//        student.setAddress(student.getAddress().toUpperCase());
        return studRepo.createStudent(student);
    }

    @Override
    public Student getStudent(String name) {
        return studRepo.select(name);
    }

    public Student updateStudent(Student student) {
        return studRepo.updateStudent(student);
    }
}
