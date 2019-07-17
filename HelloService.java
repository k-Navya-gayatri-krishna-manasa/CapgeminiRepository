package com.cg.service;

public class HelloService implements IHelloService{
	public void sayHello(String name) {
		System.out.println("Hello "+name+"!");
	}
}
