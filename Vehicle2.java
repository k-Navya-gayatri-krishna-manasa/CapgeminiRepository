package com.cg;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
@Inheritance(strategy =InheritanceType.TABLE_PER_CLASS)
/*
 * @DiscriminatorColumn(name="Vehicle_Type",discriminatorType =
 * DiscriminatorType.STRING )
 * 
 * @DiscriminatorValue("GM")
 */
public class Vehicle2 {
	@Id
	@GeneratedValue
	private int vehicleId;
	private String vehicleName;
	private String licenseNo;
	
	
	public String getLicenseNo() {
		return licenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
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
