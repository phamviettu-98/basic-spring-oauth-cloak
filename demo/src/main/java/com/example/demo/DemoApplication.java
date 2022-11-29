package com.example.demo;

import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.enity.Employee;
import com.example.demo.service.EmployeeService;

@SpringBootApplication
@RestController
@RequestMapping("/employees")
public class DemoApplication {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/{employeeId}")
	@RolesAllowed("user")
	public ResponseEntity<Employee> getEmployee(@PathVariable int employeeId){
		return ResponseEntity.ok(service.getEmplyee(employeeId));
	}
	
	@GetMapping
	@RolesAllowed("admin")
	public ResponseEntity<List<Employee>> findAllEmployees(){
		return ResponseEntity.ok(service.getAllEmployees());
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
