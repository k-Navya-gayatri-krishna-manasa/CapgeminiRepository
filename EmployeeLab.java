package com.cg.service;

public class EmployeeLab {
	private int employeeId;
	private String employeeName;
	private double salary;
	private SBULab bussinessUnit;
	
	public SBULab getBussinessUnit() {
		return bussinessUnit;
	}
	public void setBussinessUnit(SBULab bussinessUnit) {
		this.bussinessUnit = bussinessUnit;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public SBULab getSbuDetails() {
		return bussinessUnit;	
	}
	
}
