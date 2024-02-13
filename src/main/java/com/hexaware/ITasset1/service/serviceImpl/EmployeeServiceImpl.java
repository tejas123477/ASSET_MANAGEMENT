package com.hexaware.ITasset1.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.ITasset1.entity.Employee;
import com.hexaware.ITasset1.repository.EmployeeRepository;
import com.hexaware.ITasset1.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee s=null;
		 s=employeeRepository.save(employee);
		 return s;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		List<Employee> employee=employeeRepository.findAll();
		return employee;
	}

	@Override
	public Employee deleteEmployeeById(Long employeeId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
