package com.example.employeeapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String Homepage(){
        return "Add employee";
    }
    @GetMapping("/add")
    public String AddEmployee(){
        return "Add employee";
    }
}
