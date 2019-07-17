package com.cg;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue
	private int vehicleId;
	private String vehicleName;

	/*
	 * @ManyToOne private UserDetails1 user;
	 * 
	 * public UserDetails1 getUser() { return user; } public void
	 * setUser(UserDetails1 user) { this.user = user; }
	 */
	
	@ManyToMany
	private List<UserDetails1> user=new ArrayList<UserDetails1>();
	
	public List<UserDetails1> getUser() {
		return user;
	}
	public void setUser(List<UserDetails1> user) {
		this.user = user;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
}
