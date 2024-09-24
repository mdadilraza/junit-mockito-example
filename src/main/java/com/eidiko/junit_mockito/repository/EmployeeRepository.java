package com.eidiko.junit_mockito.repository;

import com.eidiko.junit_mockito.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee , Long> {
   Optional<Employee> findByEmail(String email);
}
