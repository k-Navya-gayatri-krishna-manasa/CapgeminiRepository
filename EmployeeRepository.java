package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.dto.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{ 

}
