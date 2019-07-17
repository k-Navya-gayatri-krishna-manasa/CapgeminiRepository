package com.cg.withAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClient {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext= new AnnotationConfigApplicationContext(Config.class);
		BMW b=(BMW)annotationConfigApplicationContext.getBean("bwm");
		Benz be=(Benz)annotationConfigApplicationContext.getBean("benz");
		System.out.println("BMW Info"+b);
		b.details();
		System.out.println("Benz Info:"+be.getCarNo()+"\n"+be.getCustomerName()+"\n"+be.getTyre());
		be.details();
		try 
		{
			b.cleanUp();
			be.cleanUp();
		} 		
		catch (Exception e) {
			
			e.printStackTrace();
		}
		annotationConfigApplicationContext.close();


	}

}
