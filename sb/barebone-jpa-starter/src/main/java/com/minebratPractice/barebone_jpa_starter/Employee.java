package com.minebratPractice.barebone_jpa_starter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_DATA") //name is optional
public class Employee {

	@Id
	private int id; //consdered as pkey
	
	@Column(name ="employee_name")
	private String name;
	@Column(insertable = false)
	private int age;
	

	@Column(unique = true, length = 10, nullable = false, updatable=false)
	private String ssn;
	
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
