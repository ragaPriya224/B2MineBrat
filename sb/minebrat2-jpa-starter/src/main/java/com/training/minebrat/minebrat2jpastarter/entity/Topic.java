package com.training.minebrat.minebrat2jpastarter.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


// maps objects of this topic clas to relational db 
// i would like to create a topic table and each of these member variables must
// 		go as columns in db. Each instance of this topic class should go as rows 
//			in that table. how to say this? by @entity annotation
@Entity // 
public class Topic {
	//fields
	//generated getter setter
	//generated no arg, arg constructor 
	@Id //field level annotation 
	private String id;
	private String name;
	private String description;

	public Topic() {

	}

	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
//1st step -> we have an entity mapping
//	2nd    -> we used @id annotation 

}
