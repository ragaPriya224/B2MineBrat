package com.training.minebrat.minebrat2jpastarter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.minebrat.minebrat2jpastarter.entity.Topic;

@Repository
public interface TopicRepository extends JpaRepository<Topic, String>{

}