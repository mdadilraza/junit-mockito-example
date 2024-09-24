package com.eidiko.junit_mockito;

import com.eidiko.junit_mockito.entity.Employee;
import com.eidiko.junit_mockito.repository.EmployeeRepository;
import com.eidiko.junit_mockito.service.EmployeeServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class EmployeeServiceImplTest {

    @InjectMocks
    EmployeeServiceImpl employeeService;

    @Mock
    EmployeeRepository employeeRepository;

    @Test
    void getEmployeeTest(){

        Mockito.when(employeeRepository.findById(1L)) .thenReturn(createEmployeeStub());

        Employee employee = employeeService.getEmployee(1L);
        Assertions.assertEquals(employee.getEmail() ,"adil@gmail.com");
    }

    public Optional<Employee> createEmployeeStub() {

        Employee stubEmpl = Employee
                .builder()
                .id(1L)
                .name("adil")
                .email("adil@gmail.com")
                .build();

        return Optional.of(stubEmpl);
    }
}
