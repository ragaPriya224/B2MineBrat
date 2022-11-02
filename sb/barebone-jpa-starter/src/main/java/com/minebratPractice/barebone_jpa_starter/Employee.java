package com.minebratPractice.barebone_jpa_starter;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "EMPLOYEE_DATA") //name is optional
public class Employee {

	@Id
	private int id; //consdered as pkey
	
	@Column(name ="employee_name")
	private String name;
	
	private int age;
	

	@Column(unique = true, length = 10, nullable = true, updatable=false)
	private String ssn;
	
	@Temporal(TemporalType.TIME)
	private Date dob;
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
