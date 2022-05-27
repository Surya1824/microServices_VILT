package com.employee.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.EmployeeDetails;
import com.employee.repositry.MyRepository;
import com.employee.service.EmployeeServices;

@Service
public class EmployeeServiceImp implements EmployeeServices {
	
	@Autowired
	MyRepository myRepository;
	
	public List<EmployeeDetails> listOfEmployeeDetails() {
		List<EmployeeDetails> listOfEmployee = myRepository.findAll();
		return listOfEmployee;
	}
	 public EmployeeDetails addEmployeeDetails(EmployeeDetails details) {
		 EmployeeDetails addDetails = myRepository.save(details);
		 return addDetails;
	 }
	public EmployeeDetails updateEmployeeDetails(EmployeeDetails update, long id) {
		update.setId(id);
		EmployeeDetails updateDetails = myRepository.save(update);
		return updateDetails;
	}
	
	public void deleteEmployeeDetailsById(long id) {
		myRepository.deleteById(id);
		
	}




	


}
