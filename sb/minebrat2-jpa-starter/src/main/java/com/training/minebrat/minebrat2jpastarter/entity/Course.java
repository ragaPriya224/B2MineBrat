package com.training.minebrat.minebrat2jpastarter.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity // 
public class Course {
//relationship -> many course to one topic
	@Id 
	private String courseId;
	private String courseName;
	private String courseDescription;
	@ManyToOne
	private Topic topic; //I need course obj to have info about topics 
	

	public Course() {

	}

	public Course(String courseId, String courseName, String courseDescription,String topicId) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.topic = new Topic(topicId,"","");
	}
	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}



}
