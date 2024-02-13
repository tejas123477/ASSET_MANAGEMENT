package com.hexaware.ITasset1.service;


import com.hexaware.ITasset1.entity.Employee;
import java.util.List;


import com.hexaware.ITasset1.service.EmployeeService;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);

	public List<Employee> getEmployees();

	public Employee deleteEmployeeById(Long employeeId);

}
