package com.cg.service;

import java.util.List;

public class SBULab {
	private int sbuId;
	private String sbuName;
	private String sbuhead;
	private List<EmployeeLab> emplist;
	
	public List<EmployeeLab> getEmplist() {
		return emplist;
	}
	public void setEmplist(List<EmployeeLab> emplist) {
		this.emplist = emplist;
	}
	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuhead() {
		return sbuhead;
	}
	public void setSbuhead(String sbuhead) {
		this.sbuhead = sbuhead;
	}
	@Override
	public String toString() {
		return "SBULab [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuhead=" + sbuhead + "]";
	}
	public SBULab(int sbuId, String sbuName, String sbuhead) {
		super();
		this.sbuId = sbuId;
		this.sbuName = sbuName;
		this.sbuhead = sbuhead;
	}
	public SBULab() {
		super();
	}
	
	
	
}
