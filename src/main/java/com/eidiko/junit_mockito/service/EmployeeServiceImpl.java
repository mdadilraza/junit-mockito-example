package com.eidiko.junit_mockito.service;

import com.eidiko.junit_mockito.entity.Employee;
import com.eidiko.junit_mockito.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee getEmployee(long empIdL) {
        return employeeRepository.findById(empIdL).orElseThrow(IllegalArgumentException::new);
    }
}
