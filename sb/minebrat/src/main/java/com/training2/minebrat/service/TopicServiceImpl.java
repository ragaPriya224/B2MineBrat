package com.training2.minebrat.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.training2.minebrat.entity.Topic;

@Service
public class TopicServiceImpl implements  TopicService{
	
	List<Topic>topicsList =  new ArrayList<>(Arrays.asList(new Topic("111","spiderman","saving earth"),
				new Topic("123","thor","saving galaxy")));
	@Override
	public List<Topic> getAllTopics() {
		
		return  topicsList;
	}

	@Override
	public Topic getTopic(String id ) { //111, 123 420
//	Topic output = new Topic();
		for(int i = 0; i<topicsList.size();i++) {
			Topic topic = topicsList.get(i);
			if(topic.getId().equals(id)) {
				return topic;
			}
		}
		return null;
		
	}

	@Override
	public void deleteTopic(String id) {
		topicsList.removeIf(t -> t.getId().equals(id));
		
	}

	@Override
	public void updateTopic(String id,Topic updatedTopic) {
		for(int i = 0; i<topicsList.size();i++) {
			Topic topic = topicsList.get(i);
			if(topic.getId().equals(id)) {
				topicsList.set(i, updatedTopic);
			}
		}
		
		
	}

	@Override
	public void addTopic(Topic topic) {
		topicsList.add(topic);
		
	}

	
	
}
