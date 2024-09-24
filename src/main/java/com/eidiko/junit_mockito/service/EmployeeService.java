package com.eidiko.junit_mockito.service;

import com.eidiko.junit_mockito.entity.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public interface EmployeeService {

    Employee getEmployee(long empIdL);
}
 class Main{
     public static void main(String[] args) {
         List<String> words = Arrays.asList("hello", "world");
         List<String> uniqueLetters = words.stream()
                 .flatMap(word -> Arrays.stream(word.split("")))
                 .distinct()
                 .collect(Collectors.toList());
         System.out.println(uniqueLetters);
     }
 }