package com.cg.service;

public class Customer {
	private int cid;
	private String fname;
	private String lname;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Customer(int cid, String fname, String lname) {
		super();
		this.cid = cid;
		this.fname = fname;
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", fname=" + fname + ", lname=" + lname + "]";
	}
	
}
