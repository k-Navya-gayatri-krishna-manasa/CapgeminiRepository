package com.cg;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class App1 {

	public static void main(String[] args) {
		EmploeeC emp=new EmploeeC();
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		/*
		 * emp.setName("xxxx"); emp.setGender("male"); emp.setAge(70);
		 * emp.setAnnualSalary(98675); emp.setDob("13-JUN-19"); emp.setDept("cse");
		 * entityManager.getTransaction().begin(); entityManager.persist(emp);
		 * entityManager.getTransaction().commit();
		 */
		/*
		 * TypedQuery<EmploeeC>
		 * query=entityManager.createQuery("from EmploeeC",EmploeeC.class); //to get all
		 * the data List<EmploeeC> employees=query.getResultList(); for (EmploeeC
		 * employee:employees) { System.out.println(employee); } System.out.println(
		 * "============================================================="); //to get
		 * data based on id String queryString="from EmploeeC where id=?";
		 * TypedQuery<EmploeeC>
		 * query1=entityManager.createQuery(queryString,EmploeeC.class);
		 * query1.setParameter(1, 1003); emp=query1.getSingleResult();
		 * System.out.println(emp);
		 */
		//to delete update code in notes
		
		//========================================Named Query
		TypedQuery<EmploeeC> query=entityManager.createNamedQuery("getAllEmployees",EmploeeC.class);
		List<EmploeeC> employees=query.getResultList();
		for (EmploeeC emploeeC : employees) {
			System.out.println(emploeeC);
		}
	}

}
