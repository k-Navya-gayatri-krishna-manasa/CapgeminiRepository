package com.cg;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name="Employee") //db name to which we are here comparing
@NamedQueries({
@NamedQuery(name="getAllEmployees", query="select emp from EmploeeC emp"),
@NamedQuery(name="getEmpBasedonGender", query="select emp from EmploeeC emp where gender=:gen")
})
public class EmploeeC {
	@Id
	@Column(name="empId") //here name is the name of column we gave in db
	@GeneratedValue
	private int id;
	private String name;
	private String gender;
	private int age;
	@Column(name="salary")
	private double annualSalary;
	private String dob;
	private String dept;
	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	@Override
	public String toString() {
		return "EmploeeC [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", annualSalary="
				+ annualSalary + ", dob=" + dob + ", dept=" + dept + "]";
	}
	
	
}
