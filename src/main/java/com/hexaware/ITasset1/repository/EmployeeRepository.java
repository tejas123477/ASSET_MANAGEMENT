package com.hexaware.ITasset1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.ITasset1.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

	
	
	
}
