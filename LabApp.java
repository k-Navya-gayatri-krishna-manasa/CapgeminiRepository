package com.cg;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LabApp {
	static Scanner sc=new Scanner(System.in);
	static EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPA-PU");
	static EntityManager entityManager=entityManagerFactory.createEntityManager();

	public static void main(String[] args) {
		AuthorClass authorClass=new AuthorClass();
				entityManager.getTransaction().begin();
				System.out.println("Enter data to add");
				addAuthor(authorClass);	
				System.out.println("Data Added");
				System.out.println("Enter Id to find");
				int n1=sc.nextInt();
				authorClass=getAuthorById(n1);
				System.out.println("Id found:Details are:-");
				System.out.println(authorClass.getAuthorId()+"\n"+authorClass.getFirstName()+"\n"+authorClass.getMiddleName()+"\n"+authorClass.getLastName()+"\n"+authorClass.getPhone());
				System.out.println("Enter Id to update");
				int n=sc.nextInt();
				update(n);
				System.out.println("Data updated");
				System.out.println("Enter Id to delete");
				int n2=sc.nextInt();
				delete(n2);
				entityManager.getTransaction().commit();
				entityManager.close();

	}
	public static void addAuthor(AuthorClass authorClass) {
		authorClass.setAuthorId(sc.nextInt());
		authorClass.setFirstName(sc.next());
		authorClass.setMiddleName(sc.next());
		authorClass.setLastName(sc.next());
		authorClass.setPhone(sc.next());
		entityManager.persist(authorClass);
	}
	public static AuthorClass getAuthorById(int id) {
		AuthorClass authorClass=entityManager.find(AuthorClass.class, id);
		return authorClass;
	}
	public static void update(int id) {
		AuthorClass authorClass=entityManager.find(AuthorClass.class,id);
		if(authorClass!=null) {
			System.out.println("Update the data");
			authorClass.setFirstName(sc.next());
			authorClass.setMiddleName(sc.next());
			authorClass.setLastName(sc.next());
			authorClass.setPhone(sc.next());
			entityManager.merge(authorClass);
		}
		else {
			System.out.println("Id not found");
		}
	}
	public static void delete(int id) {
		AuthorClass authorClass=entityManager.find(AuthorClass.class,id);
		if(authorClass!=null) {
			entityManager.remove(id);
		}
		else {
			System.out.println("Id not found");
		}
	}

}
