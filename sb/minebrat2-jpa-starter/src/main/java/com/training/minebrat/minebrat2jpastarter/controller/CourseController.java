package com.training.minebrat.minebrat2jpastarter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.minebrat.minebrat2jpastarter.entity.Course;
import com.training.minebrat.minebrat2jpastarter.entity.Topic;
import com.training.minebrat.minebrat2jpastarter.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	CourseService courseService;
	
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id){
		return courseService.getAllCourses(id);
	}
	@RequestMapping("/topics/{id}/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId){
		return courseService.getCourse(courseId);
	}
	
	@RequestMapping(method = RequestMethod.POST, value ="/topics/{topicId}/courses")
	public void addCourse(@PathVariable String topicId,@RequestBody Course course){
		course.setTopic(new Topic(topicId,"",""));
		courseService.addCourse(course);
	
	}
	@RequestMapping(method = RequestMethod.PUT, value ="/topics/{id}/courses/{courseId}")
	public void updateCourse(@PathVariable String topicId,@RequestBody Course course){
		course.setTopic(new Topic(topicId,"",""));
		courseService.updateCourse(course);
	}
	@RequestMapping(method = RequestMethod.DELETE, value ="/topics/{id}/courses/{courseId} ")
	public void deleteCourse(@PathVariable String courseId){
		courseService.deleteCourse(courseId);
	}
	
}

