package com.eidiko.junit_mockito.controller;

import com.eidiko.junit_mockito.entity.Employee;
import com.eidiko.junit_mockito.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Api/v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService ;

    @GetMapping("/{empIdL}")
    public Employee getEmployee(@PathVariable long empIdL) {

     return   employeeService.getEmployee(empIdL);
    }
}
