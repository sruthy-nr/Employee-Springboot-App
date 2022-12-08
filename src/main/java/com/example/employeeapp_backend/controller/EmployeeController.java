package com.example.employeeapp_backend.controller;

import com.example.employeeapp_backend.dao.EmployeeDao;
import com.example.employeeapp_backend.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao dao;
    @CrossOrigin(origins = "*")
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

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Employees> ViewEmployee(){

        return (List<Employees>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search", consumes = "application/json", produces = "application/json")
    public List<Employees> SearchEmployee(@RequestBody Employees e){

        String employeecode =String.valueOf(e.getEmployeecode());
        System.out.println(employeecode);
        return  (List<Employees>) dao.SearchEmployee(e.getEmployeecode());

    }
    @CrossOrigin(origins = "*")
    @PostMapping("/edit")
    public String EditEmployee(){
        return "Edit employee";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/delete", consumes = "application/json", produces = "application/json")
    public HashMap<String,String> DeleteEmployee(@RequestBody Employees e){
        String empid= String.valueOf(e.getId());
        System.out.println(empid);
        dao.DeleteEmployee(e.getId());
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }
}
