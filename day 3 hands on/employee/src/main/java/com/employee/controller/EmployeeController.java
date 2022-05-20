package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.EmployeeDetails;

import com.employee.service.EmployeeServices;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeServices employeeServices;
	
	@GetMapping (value = "/listOfEmployee")
	List<EmployeeDetails> retrieveAll(){
		List<EmployeeDetails> listOfEmployee = employeeServices.listOfEmployeeDetails();
		return listOfEmployee;
		
	}
	

	

}
