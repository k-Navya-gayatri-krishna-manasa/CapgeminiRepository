package com.cg;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class UserDetails1 {
	@Id
	@GeneratedValue
	private int id;
	private String name;

	/*
	 * @OneToOne(cascade=CascadeType.PERSIST) private Vehicle vehicle;//variable of class type public
	 * Vehicle getVehicle() { return vehicle; } public void setVehicle(Vehicle
	 * vehicle) { this.vehicle = vehicle; }
	 */
	
	 //when we do two way binding then add (mapping="user") here user is obj created in vehicle class
	
	//to customise the names after joining the tables by default hibernate gives some name 
	/*
	 * @JoinTable(name="userVehicle",joinColumns=@JoinColumn(name="userId"),
	 * inverseJoinColumns=@JoinColumn(name="vid"))
	 */	
	@ManyToMany  (mappedBy="user",cascade=CascadeType.PERSIST) 
	List<Vehicle> vehicle=new ArrayList<Vehicle>();
	public  List<Vehicle> getVehicle()
	{ 
		return vehicle;
		} 
	public void setVehicle( List<Vehicle> vehicle)
	{ 
		this.vehicle = vehicle; 
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

