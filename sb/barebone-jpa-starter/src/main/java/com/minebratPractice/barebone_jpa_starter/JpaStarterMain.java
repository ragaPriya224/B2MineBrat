package com.minebratPractice.barebone_jpa_starter;

import java.util.Date;

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
		
		//create instance of employee
		Employee e = new Employee();
		e.setId(1);
		e.setName("hello");
		e.setSsn("123");
		e.setDob(new Date());
		e.setType(EmployeeType.FULL_TIME); // value will be o.bcoz integer type
		
		Employee e2 = new Employee();
		e2.setId(1);
		e2.setName("afternoon");
		e2.setSsn("456");
		

		
		EntityTransaction t = em.getTransaction();
		t.begin(); //start transaction
		em.persist(e); //save my employee data 
		em.persist(e2);

		t.commit();/// it will get saved 
		
	}

}
