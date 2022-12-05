package com.example.employeeapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String Homepage(){
        return "Welcome to my website";
    }
    @PostMapping("/add")
    public String AddEmployee(){
        return "Add employee";
    }
    @GetMapping("/view")
    public String ViewEmployee(){
        return "View employees";
    }
    @PostMapping("/search")
    public String SearchEmployee(){
        return "Search employee";
    }
    @PostMapping("/edit")
    public String EditEmployee(){
        return "Edit employee";
    }
    @PostMapping("/delete")
    public String DeleteEmployee(){
        return "Delete employee";
    }
}
