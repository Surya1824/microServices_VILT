package com.employee.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.employee.entity.EmployeeDetails;
import com.employee.repositry.MyRepository;
import com.employee.service.EmployeeServices;

@Service
public abstract class EmployeeServiceImp implements EmployeeServices {
	
	@Autowired
	MyRepository myRepository;
	
	public List<EmployeeDetails> retrieveAll() {
		List<EmployeeDetails> listOfEmployee = myRepository.findAll();
		return listOfEmployee;
	}
	 public EmployeeDetails addDetail(EmployeeDetails details) {
		 EmployeeDetails addDetails = myRepository.save(details);
		 return addDetails;
	 }

}
