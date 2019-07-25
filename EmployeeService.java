package com.cg.service;

import java.util.List;

import com.cg.dto.Employee;

public interface EmployeeService {
	
	public List<Employee> showAllEmployee();
	public Employee addEmployee(Employee employee);
	public Employee searchByEmployeeId(int empId);
	public void deletEmployee(int empId);
	public Employee updateEmployee(Employee employee);
	
}
