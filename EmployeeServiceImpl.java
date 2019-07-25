package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.EmployeeRepository;
import com.cg.dto.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> showAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public Employee searchByEmployeeId(int empid) {
		// TODO Auto-generated method stub
		//return employeeRepository.findById(empid).get();
		 List<Employee> empList=showAllEmployee();
		    Employee emp = null;
		    for (Employee employee : empList) 
		    {
		if(employee.getEmpId().equals(empid))
		emp=employee;
		}
		return emp;
	}

	@Override
	public void deletEmployee(int empId) {
		employeeRepository.deleteById(empId);
		
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Optional<Employee> employees=employeeRepository.findById(employee.getEmpId());
		Employee e=employees.get();
		e.setEmpName(employee.getEmpName());
		e.setEmpSalary(employee.getEmpSalary());
		employeeRepository.save(e);
		return e;
	}
	
}
