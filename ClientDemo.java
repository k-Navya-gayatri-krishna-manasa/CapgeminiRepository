package com.cg.ui;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.service.House;

public class ClientDemo {

	public static void main(String[] args) {
		 AbstractApplicationContext context=new ClassPathXmlApplicationContext("usinglist.xml");
		 House h=(House) context.getBean("house");
		 


	}

}
