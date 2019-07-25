package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dto.Employee;
import com.cg.service.EmployeeService;

@RestController
@RequestMapping("/emplist")
@CrossOrigin(origins="http://localhost:4200")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
//	@RequestMapping(value="/getalldata",method=RequestMethod.GET)
//	or  from 2.0.4
	@GetMapping("/getalldata")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> employees=employeeService.showAllEmployee();
		if(employees.isEmpty()) {
			return new ResponseEntity("No employee Found",HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Employee>>(employees,HttpStatus.OK);
	}
	
	@PostMapping("/adddata")
	public ResponseEntity addEmployee(@ModelAttribute Employee employee) {
		Employee employee2=employeeService.addEmployee(employee);
		if(employee2==null) {
			return new ResponseEntity("Data not added", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Employee>(employee2,HttpStatus.OK);
		
	}
	
	@GetMapping("/getbyId/{eid}")
	public  ResponseEntity<Employee> findByEmpId(@PathVariable Integer eid){
		Employee data=employeeService.searchByEmployeeId(eid) ;
		if(data==null) {
			return new ResponseEntity("No employee Found",HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(data,HttpStatus.OK);
	}
	
//	@DeleteMapping("/delete/{eid}")
//	public  String deletion(@PathVariable("eid") Integer empId){
//		Employee employees=employeeService.deletEmployee(empId) ;
//		if(employees==null) {
//			return new ResponseEntity("No employee Found to delete",HttpStatus.NOT_FOUND);
//		}
//		return new ResponseEntity<Employee>("Employee deleted",HttpStatus.OK);
//	}
//	
	@PutMapping("/updatedata")
	public  ResponseEntity<Employee> update(@RequestBody Employee employee){
		Employee data=employeeService.updateEmployee(employee);
		if(data==null) {
			return new ResponseEntity("No employee Found",HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(data,HttpStatus.OK);
	}  


}
