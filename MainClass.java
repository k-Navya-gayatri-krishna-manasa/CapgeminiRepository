package com.cg;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU"); 
		EntityManager em=factory.createEntityManager();
		
		Vehicle2 vehicle=new Vehicle2();
		vehicle.setVehicleName("Auto");
		vehicle.setLicenseNo("1234");
		TwoWheeler tw=new TwoWheeler();
		tw.setVehicleName("Bike");
		tw.setLicenseNo("3456");
		tw.setSteeringHandle("BikesteeringHandle");
		FourWheeler fw=new FourWheeler();
		fw.setVehicleName("Porsche");
		fw.setLicenseNo("6789");
		fw.setSteeringWheel("PorschesteeringWheel");
		em.getTransaction().begin();
		em.persist(vehicle);
		em.persist(tw);
		em.persist(fw);
		em.getTransaction().commit();
		System.out.println("Done");

	}

}
