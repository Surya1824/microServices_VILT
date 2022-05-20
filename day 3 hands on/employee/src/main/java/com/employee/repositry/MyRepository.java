package com.employee.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.entity.EmployeeDetails;

@Repository
public interface MyRepository extends JpaRepository<EmployeeDetails, Long>{

}
