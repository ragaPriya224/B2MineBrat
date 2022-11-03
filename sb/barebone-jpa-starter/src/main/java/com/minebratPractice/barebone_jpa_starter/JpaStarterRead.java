package com.minebratPractice.barebone_jpa_starter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaStarterRead {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myApp");

		EntityManager em = emf.createEntityManager();
		Employee employee = em.find(Employee.class, 1);
		System.out.println("output is:   "+employee );
		System.out.println("name is:   "+employee.getName() );

		System.out.println("card is:   "+employee.getCard() );
		
		AccessCard card = em.find(AccessCard.class, 3);
		System.out.println(card);

	}
}
