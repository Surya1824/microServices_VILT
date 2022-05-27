package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping (value = "/addEmployees")
	EmployeeDetails creatDetail(@RequestBody EmployeeDetails detail) {
		EmployeeDetails d = employeeServices.addEmployeeDetails(detail);
		
		return d;
	}
	
	@PutMapping(value = "/updateDetails/{id}")
	EmployeeDetails updateDetailsById(@RequestBody EmployeeDetails detail,@PathVariable long id) {
		EmployeeDetails u = employeeServices.updateEmployeeDetails(detail, id);
		return u;
		
	}
	
	@DeleteMapping(value="/deleteDetail/{id}")
	String deleteEmployeeDetailsById(@PathVariable Long id) {
		
		employeeServices.deleteEmployeeDetailsById(id);
		return "deleted record "+id;}
}
