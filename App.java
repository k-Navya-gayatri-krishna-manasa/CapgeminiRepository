package com.cg;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		/*
		 * UserDetails user=new UserDetails(); user.setId(1004); user.setName("Pandu");
		 * EntityManagerFactory
		 * factory=Persistence.createEntityManagerFactory("JPA-PU"); EntityManager
		 * em=factory.createEntityManager(); em.getTransaction().begin();
		 * em.persist(user); em.detach(user); //to detach/delete an obj
		 * user.setName("Candy"); em.getTransaction().commit(); em.close();
		 * System.out.println("Data Saved");
		 */
		
		//to retreive data from db table
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU"); 
		EntityManager em=factory.createEntityManager();
		 em.getTransaction().begin();
		UserDetails user=em.find(UserDetails.class,1004);
		System.out.println(user.getName());
		
		//setting the name again
		/*
		 * user.setName("Name"); em.getTransaction().commit();
		 * System.out.println("Updated");
		 */
		
		em.remove(user);
		 em.getTransaction().commit();
		System.out.println("===================");	
		System.out.println(user.getName());

		
	}
}
