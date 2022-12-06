package com.example.employeeapp_backend.controller;

import com.example.employeeapp_backend.dao.EmployeeDao;
import com.example.employeeapp_backend.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao dao;
    @GetMapping("/")
    public String Homepage(){
        return "Welcome to my website";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public String AddEmployee(@RequestBody Employees e){

        System.out.println(e.getEmployeecode().toString());
        System.out.println(e.getEmployeename().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getSalary());
        System.out.println(e.getCompanyname().toString());
        System.out.println(e.getMobile().toString());
        System.out.println(e.getUsername().toString());
        System.out.println(e.getPassword().toString());
        dao.save(e);
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
