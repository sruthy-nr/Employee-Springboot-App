package com.example.employeeapp_backend.dao;

import com.example.employeeapp_backend.model.Employees;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employees,Integer> {
    @Query(value = "SELECT `id`, `companyname`, `designation`, `employeecode`, `employeename`, `mobile`, `password`, `salary`, `username` FROM `employees` WHERE `employeecode`= :employeecode",nativeQuery = true)
    List<Employees> SearchEmployee(@Param("employeecode") String employeecode);
}
