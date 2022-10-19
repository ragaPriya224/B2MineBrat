package com.training2.minebrat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	

	@RequestMapping(method = RequestMethod.DELETE, value ="/topics/{id}")  
	public void deleteTopic(@PathVariable String  id){
        topicService.deleteTopic(id);
	}
	@RequestMapping(method = RequestMethod.PUT, value ="/topics/{id}")  
	public void updateTopic(@PathVariable String  id, @RequestBody Topic topic ){
        topicService.updateTopic(id,topic);
	}
	@RequestMapping(method = RequestMethod.POST, value ="/topics")  
	public void addTopic(@RequestBody Topic topic){
		//reqbody-> tells that  request payload is going to contain a
//			JSON representation of this topic
        topicService.addTopic(topic);
        //I need to do: get that post body, convert into a topic instance and then
//           add to list
	}
	
}