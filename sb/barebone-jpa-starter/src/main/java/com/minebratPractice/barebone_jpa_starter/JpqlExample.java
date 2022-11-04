package com.minebratPractice.barebone_jpa_starter;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class JpqlExample {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myApp");
		EntityManager em = emf.createEntityManager();

		TypedQuery<Employee> q = em.createQuery("SELECT e FROM Employee e ",Employee.class );
		// u have to deal with java side, u should not db side 
		//name of class is employee
		//name of table is employee_data
		// don't mention star,mention alias name 

		List<Employee> resultList = q.getResultList(); //gives list of employees
		System.out.println(resultList);
		em.close();
		emf.close();
	}
}
