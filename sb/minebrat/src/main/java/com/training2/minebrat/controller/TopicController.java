package com.training2.minebrat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training2.minebrat.entity.Topic;
import com.training2.minebrat.service.TopicService;

@RestController
public class TopicController {

	
	@Autowired
	TopicService topicService;
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
//		return  Arrays.asList(new Topic("111","spiderman","saving earths"),
//				new Topic("404s","thor","saving galaxy"));
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")  //{} for dynamic ids
	public Topic getTopic(@PathVariable String  id){

		return topicService.getTopic(id);
	}
	
}