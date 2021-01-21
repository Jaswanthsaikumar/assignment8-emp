package com.empapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import com.empapp.model.entities.Employee;
import com.empapp.model.service.EmployeeService;

@EnableWebSecurity
@SpringBootApplication
public class Empapp1Application implements CommandLineRunner{

	@Autowired
	private EmployeeService empService;
	
	public static void main(String[] args) {
		SpringApplication.run(Empapp1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	/*	
		empService.save(new Employee("Kumar", 23));
		empService.save(new Employee("jaswanth", 35));
		empService.save(new Employee("roshan", 20));
		empService.save(new Employee("vamsi", 25));		
	}*/
}
}
