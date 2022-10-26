package com.training.minebrat.minebrat2jpastarter.service;

import java.util.List;

import com.training.minebrat.minebrat2jpastarter.entity.Course;
import com.training.minebrat.minebrat2jpastarter.entity.Topic;

public interface CourseService {

	void addCourse(Course course);

	void updateCourse(Course course);

	void deleteCourse(String courseId);

	Course getCourse(String courseId);

	List<Course> getAllCourses(String id);

	
}
