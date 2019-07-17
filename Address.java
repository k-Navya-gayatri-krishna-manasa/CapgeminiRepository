package com.cg.service;

public class Address {
	private String streetname;
	private String city;
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(String streetname, String city) {
		super();
		this.streetname = streetname;
		this.city = city;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [streetname=" + streetname + ", city=" + city + "]";
	}
	
	
	
	
}
