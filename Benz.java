package com.cg.withAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Benz implements IVehicle {
	private Integer carNo;
	private String customerName;
	private Tyre tyre;
	@PostConstruct
    public void BMWInit() 
    {
        System.out.println("Method BenzInit() invoked...");
    } 
    @PreDestroy
    public void BMWDestroy() 
    {
        System.out.println("Method BenzDestroy() invoked...");
    }
    public void setUp()throws Exception
	{
		
		System.out.println(" Initializing the Benz Bean with custom Config");
	}
	
	public void cleanUp()throws Exception
	{
		
		System.out.println(" Destroying the Benz Bean with custom Config");

	}
	
	public Tyre getTyre() {
		return tyre;
	}
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	public Integer getCarNo() {
		return carNo;
	}
	public void setCarNo(Integer carNo) {
		this.carNo = carNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void details() {
		System.out.println("In Benz");
		
	}
	
}
