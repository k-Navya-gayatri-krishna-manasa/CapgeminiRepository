package com.cg.service;

import java.util.List;

public class House {
	private int hno;
	private String hname;
	private String htype;
	private List<Address> address;
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getHtype() {
		return htype;
	}
	public void setHtype(String htype) {
		this.htype = htype;
	}
	
	
	public House(int hno, String hname, String htype, List<Address> address) {
		super();
		this.hno = hno;
		this.hname = hname;
		this.htype = htype;
		this.address = address;
	}
	public House() {
		super();
	}
	@Override
	public String toString() {
		return "House [hno=" + hno + ", hname=" + hname + ", htype=" + htype + ", address=" + address + "]";
	}
	
	
	

}
