package com.training.minebrat.minebrat2jpastarter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.minebrat.minebrat2jpastarter.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, String>{

List<Course> findByTopicId(String topicId); //custom 
	
}