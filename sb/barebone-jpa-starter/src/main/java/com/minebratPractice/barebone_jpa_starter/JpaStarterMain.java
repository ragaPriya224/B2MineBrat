package com.minebratPractice.barebone_jpa_starter;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaStarterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//static method  that's why no creation of obj
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myApp");

		EntityManager em = emf.createEntityManager();

//		Employee employee = em.find(Employee.class, 1);
		
		
		AccessCard  card1 = new AccessCard();
		card1.setFirmwareVersion("1.0.0");
		card1.setIssuedDate(new Date());
		card1.setActive(true);
	
//		card1.setId(110);
		AccessCard  card2 = new AccessCard();
		card2.setFirmwareVersion("2.0.0");
		card2.setIssuedDate(new Date());
		card2.setActive(false);
//		card2.setId(20);
		
//		System.out.println(employee);
//		Employee e2 = em.find(Employee.class, 2);
//
//		System.out.println("output is" + e2);
//		Employee e3 = em.find(Employee.class, 3);

//		System.out.println("output for id3 is " + e3); //in sql, o/p is empty result, in java, it's null
		//		
		//		//create instance of employee
				Employee e = new Employee();
		//		e.setId(1);
				e.setName("hello");
				e.setSsn("123");
				e.setDob(new Date());
				e.setType(EmployeeType.FULL_TIME); // value will be o.bcoz integer type
e.setCard(card1);
			
				Employee e2 = new Employee();
		//		e2.setId(2);
				e2.setName("afternoon");
				e2.setSsn("456");
				e2.setCard(card2);// not linking individual value, linking the instance
	
				
				
				card1.setOwner(e); //cyclical relationship s
				card2.setOwner(e2);
//				EntityTransaction t = em.getTransaction();
//				t.begin(); //start transaction
//				em.persist(e); //save my employee data 
//				em.persist(e2);
//				em.persist(card1);
//				em.persist(card2);
//				
				System.out.println(card1.getOwner());
////				em.remove(employee);
//		//		
//		//
//				t.commit();/// it will get saved 
//		em.close();
//		emf.close(); 
	}

}
