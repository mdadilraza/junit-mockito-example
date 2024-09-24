package com.eidiko.junit_mockito.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;

    @Column(name = "name",nullable = false)
    private String name ;

    @Column(name = "email",nullable = false,unique = true)
    private String email;
}
