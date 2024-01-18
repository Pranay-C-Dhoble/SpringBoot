package com.example.BootApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetControllerApp {
    @GetMapping("/get")
    public String get(){
        return "Hi I am From Controller";
    }
}
