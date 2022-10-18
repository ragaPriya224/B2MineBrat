package com.training2.minebrat.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.training2.minebrat.entity.Topic;

@Service
public class TopicServiceImpl implements  TopicService{

	
	List<Topic>topicsList =  Arrays.asList(new Topic("111","spiderman","saving earth"),
				new Topic("123","thor","saving galaxy"));
	@Override
	public List<Topic> getAllTopics() {
		
		return  topicsList;
	}

	@Override
	public Topic getTopic(String id ) { //111, 123 420
		// TODO Auto-generated method stub
		for(int i = 0; i<topicsList.size();i++) {
			Topic topic = topicsList.get(i);
			if(topic.getId() == id) {
				return topic;
			}
		}
		
	}

	
	
}
