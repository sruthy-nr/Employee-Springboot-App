package com.example.employeeapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String Homepage(){
        return "Welcome to my website";
    }
    @GetMapping("/add")
    public String AddEmployee(){
        return "Add employee";
    }
    @GetMapping("/view")
    public String ViewEmployee(){
        return "View employees";
    }
    @GetMapping("/search")
    public String SearchEmployee(){
        return "Search employee";
    }
}
