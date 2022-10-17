package com.cats.ems.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cats.ems.model.Employee;
import com.cats.ems.repo.EmployeeRepo;
import com.cats.ems.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

}
