package com.cats.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cats.ems.model.Employee;
import com.cats.ems.repo.EmployeeRepo;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeRepo employeeRepo;

	@PostMapping("/save")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee employee)
	{
		employeeRepo.save(employee);
		return ResponseEntity.ok("Successfully Registered...");
	}
}
