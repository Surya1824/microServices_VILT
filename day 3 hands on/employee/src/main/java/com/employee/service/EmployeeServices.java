package com.employee.service;

import java.util.List;


import com.employee.entity.EmployeeDetails;

public interface EmployeeServices {
	
	// service give by admin insest
	EmployeeDetails addEmployeeDetails(EmployeeDetails details);
	
	//get list of products from db
	List<EmployeeDetails> listOfEmployeeDetails();

}
