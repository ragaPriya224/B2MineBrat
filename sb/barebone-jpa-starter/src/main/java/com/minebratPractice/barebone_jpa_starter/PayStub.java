package com.minebratPractice.barebone_jpa_starter;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PayStub {

	@Id
	@GeneratedValue
	private int id;
	private Date payPeriodStart;
	private Date payPeriodEnd;
	private float salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getPayPeriodStart() {
		return payPeriodStart;
	}
	public void setPayPeriodStart(Date payPeriodStart) {
		this.payPeriodStart = payPeriodStart;
	}
	public Date getPayPeriodEnd() {
		return payPeriodEnd;
	}
	public void setPayPeriodEnd(Date payPeriodEnd) {
		this.payPeriodEnd = payPeriodEnd;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

	
}
