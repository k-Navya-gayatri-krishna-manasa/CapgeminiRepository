package com.cg.withAnnotations;
import javax.annotation.*;
public class BMW implements IVehicle {
	private Integer carNo;
	private String customerName;
	private Tyre tyre;

	@PostConstruct
    public void BMWInit() 
    {
        System.out.println("Method BMWInit() invoked...");
    } 
    @PreDestroy
    public void BMWDestroy() 
    {
        System.out.println("Method BMWDestroy() invoked...");
    }
    public void setUp()throws Exception
	{
		
		System.out.println(" Initializing the BMW Bean with custom Config");
	}
	
	public void cleanUp()throws Exception
	{
		
		System.out.println(" Destroying the BMW Bean with custom Config");

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


	public Tyre getTyre() {
		return tyre;
	}
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	public void details() {
		System.out.println("In BMW");
	}
	public BMW(Integer carNo, String customerName, Tyre tyre) {
		super();
		this.carNo = carNo;
		this.customerName = customerName;
		this.tyre = tyre;
	}
	
	@Override
	public String toString() {
		return "BMW [carNo=" + carNo + ", customerName=" + customerName + ", tyre=" + tyre + "]";
	}
	public BMW() {
		super();
	}
	
	
}
