package com.cg.withAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Tyre{
	private String tyreCompany;
	private String tyreColor;
	
	@PostConstruct
    public void TyreInit() 
    {
        System.out.println("Method TyreInit() invoked...");
    } 
    @PreDestroy
    public void TyreDestroy() 
    {
        System.out.println("Method TyreDestroy() invoked...");
    }
	public String getTyreCompany() {
		return tyreCompany;
	}
	public void setTyreCompany(String tyreCompany) {
		this.tyreCompany = tyreCompany;
	}
	public String getTyreColor() {
		return tyreColor;
	}
	public void setTyreColor(String tyreColor) {
		this.tyreColor = tyreColor;
	}
	public Tyre(String tyreCompany, String tyreColor) {
		super();
		this.tyreCompany = tyreCompany;
		this.tyreColor = tyreColor;
	}
	public Tyre() {
		super();
	}
	@Override
	public String toString() {
		return "Tyre [tyreCompany=" + tyreCompany + ", tyreColor=" + tyreColor + "]";
	}
	

}
