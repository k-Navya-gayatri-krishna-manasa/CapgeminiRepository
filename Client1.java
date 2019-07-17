package com.cg.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.service.HelloService;
import com.cg.service.IHelloService;

public class Client1 {
	@Autowired
	private static IHelloService helloService;

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("rabbit.xml");
		helloService=(IHelloService) applicationContext.getBean("helloService");
		helloService.sayHello("bujji");
	}

}
