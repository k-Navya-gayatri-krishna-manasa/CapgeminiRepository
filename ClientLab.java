package com.cg.ui;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.service.EmployeeLab;
import com.cg.service.SBULab;

public class ClientLab {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("lab.xml");
		SBULab sbuLab=(SBULab)context.getBean("unit");
		EmployeeLab employeeLab=(EmployeeLab) context.getBean("emp");
		System.out.println("Employee Details");
		System.out.println(employeeLab.getEmployeeId()+"\n"+employeeLab.getEmployeeName()+"\n"+employeeLab.getSalary());
		//employeeLab.setBussinessUnit(sbuLab);
		/*
		 * SBULab sbuLab2=employeeLab.getSbuDetails();
		 */		
		System.out.println(employeeLab.getSbuDetails());
		
		System.out.println("------------------2.3-------------------");
		System.out.println(sbuLab.getEmplist());

	}

}
