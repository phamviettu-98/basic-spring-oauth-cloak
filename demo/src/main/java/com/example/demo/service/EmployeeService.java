package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.enity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@PostConstruct
	public void initialzeEmployeeTable() {
		employeeRepository.saveAll(
				Stream.of(new Employee("John", 20000), new Employee("mak", 550000),
						new Employee("peter", 129000)).collect(Collectors.toList()));
	}
	
	public Employee getEmplyee(int employeeId) {
		return employeeRepository.findById(employeeId).orElse(null);
	}
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}

}
