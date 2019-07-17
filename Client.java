package com.cg.ui;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.cg.service.Customer;
import com.cg.service.Employee;
import com.cg.service.HelloService;
import com.cg.service.IHelloService;

public class Client {

	public static void main(String[] args) {
		
		//tightly coupled=>normal way
		
		/*
		 * HelloService helloService=new HelloService(); 
		 * helloService.sayHello("Manu");
		 */
		/*
		 * Resource resource=new ClassPathResource("rabbit.xml"); BeanFactory
		 * beanFactory=new XmlBeanFactory(resource);
		 */
		
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("rabbit.xml"));
		IHelloService service=(HelloService) beanFactory.getBean("helloService"); //helloService is the id gave in rabbit.xml file
		service.sayHello("Candy");
		Employee e=(Employee) beanFactory.getBean("emp");
		//setter Injection
		System.out.println(e.getFirstName());
		System.out.println(e.getLastName());
		//using constructor
		
		Customer customer=(Customer)beanFactory.getBean("cus");
		
		//or
		
		/*
		 * AbstractApplicationContext context=new ClassPathXmlApplicationContext("rabbit.xml"); 
		 * Customer customer=(Customer)context.getBean("cus");
		 */
		System.out.println(customer);
		System.out.println(customer.getCid()+"\n"+customer.getFname()+"\n"+customer.getLname());
		
	}

}
