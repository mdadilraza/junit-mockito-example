package com.eidiko.junit_mockito.repository;

import com.eidiko.junit_mockito.entity.Employee;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    @Order(1)
    @Rollback(value = false)
    public void saveEmployeeTest() {
        Employee employee
                = Employee.builder()
                .name("Adil")
                .email("adil@gmail.com")
                .build();

        employeeRepository.save(employee);

        assertThat(employee.getId()).isGreaterThan(0);
    }

    @Test
    @Order(2)

    public void getEmployeeTest() {

        Employee employee = employeeRepository.findById(1L).get();
        System.out.println(employee);
        assertThat(employee.getId()).isEqualTo(1L);
    }

    @Test
    @Order(3)

    void getListOfEmployee() {

        List<Employee> employees = employeeRepository.findAll();

        assertThat(employees.size()).isGreaterThan(0);
    }

    @Test
    @Order(4)
    @Rollback(value = false)
    void updateEmployeeTest () {


        Employee employee = employeeRepository.findById(1L) .get();

        employee.setEmail("raza@gmail.com");

        Employee employeeUpdated = employeeRepository.save(employee);
        assertThat(employeeUpdated.getEmail()).isEqualTo("raza@gmail.com");
    }

    @Test
    @Order(5)
    @Rollback(value = false)
    void deleteEmployeeTest() {

        Employee employee = employeeRepository.findById(1L).get();

        employeeRepository.delete(employee);
        Employee employee1 =null;
        Optional<Employee> byEmail = employeeRepository.findByEmail("raza@gmail.com");

        if(byEmail .isPresent()){
           employee1= byEmail.get();
        }
        assertThat(employee1).isNull();
    }
}
