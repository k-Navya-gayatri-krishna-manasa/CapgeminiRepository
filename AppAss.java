package com.cg;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppAss {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU"); 
		EntityManager em=factory.createEntityManager();
		UserDetails1 user=new UserDetails1();
		user.setName("Babe");
		Vehicle v= new Vehicle();
		Vehicle v1= new Vehicle();
		v.setVehicleName("Car");
		v1.setVehicleName("Jeep");

		/* user.setVehicle(v); */
		//one to many from user to vehicle
		user.getVehicle().add(v);
		user.getVehicle().add(v1);
		
		//ManytoMany in vehicle
		v.getUser().add(user);
		v1.getUser().add(user);
		
		//Many to one from vehicle to user
		/*
		 * v.setUser(user); v1.setUser(user);
		 */
		em.getTransaction().begin();
		em.persist(user);
		//these 2 statements can be omitted if in userDetaisl1 class you write cascade
		/*
		 * em.persist(v); em.persist(v1);
		 */
		em.getTransaction().commit();
		System.out.println("Done");


	}

}
