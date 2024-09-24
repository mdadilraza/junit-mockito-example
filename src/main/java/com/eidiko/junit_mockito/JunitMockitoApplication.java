package com.eidiko.junit_mockito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@org.springframework.context.annotation.Configuration
//@SpringBootApplication(exclude = Configuration.class)
@ComponentScan()
@EnableAutoConfiguration
public class JunitMockitoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JunitMockitoApplication.class, args);
	}

}
