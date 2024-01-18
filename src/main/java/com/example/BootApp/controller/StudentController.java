package com.example.BootApp.controller;

import com.example.BootApp.model.Student;
import com.example.BootApp.service.StudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudService studService;
    @PostMapping("/studentAdd")
    public Student postStudent(@RequestBody Student student) {
        return studService.createStudent(student);
    }
    @GetMapping("/studentGet/{name}")
    public Student getStudent(@PathVariable String name) {
        return studService.getStudent(name);
    }
    @PutMapping("/studentUpdate")
    public Student updateStudent(@RequestBody Student student) {
        return studService.updateStudent(student);
    }
}
