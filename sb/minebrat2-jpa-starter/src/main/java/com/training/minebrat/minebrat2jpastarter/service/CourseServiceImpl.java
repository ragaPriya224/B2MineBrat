package com.training.minebrat.minebrat2jpastarter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.minebrat.minebrat2jpastarter.entity.Course;
import com.training.minebrat.minebrat2jpastarter.repository.CourseRepository;

@Service
public class CourseServiceImpl implements  CourseService{

	@Autowired
	CourseRepository courseRepository;
	
	@Override
	public void addCourse(Course course) {
		System.out.println("*************** add course method called");
		Course output = courseRepository.save(course);
		System.out.println("***************" +output);
	}

	@Override
	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	@Override
	public void deleteCourse(String courseId) {
		courseRepository.deleteById(courseId);
		
	}

	@Override
	public Course getCourse(String courseId) {
		return courseRepository.findById(courseId).get();
		
	}

	@Override
	public List<Course> getAllCourses(String id) {
		// TODO Auto-generated method stub
	return courseRepository.findByTopicId(id);
	}
	
	
	
}
