package com.example.employeeapp_backend.dao;

import com.example.employeeapp_backend.model.Employees;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employees,Integer> {
}
