package com.example.employeeapp_backend.controller;

import com.example.employeeapp_backend.model.Employees;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String Homepage(){
        return "Welcome to my website";
    }
    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public String AddEmployee(@RequestBody Employees e){

        System.out.println(e.getEmployeename().toString());
        return "Employee added successfully";
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
