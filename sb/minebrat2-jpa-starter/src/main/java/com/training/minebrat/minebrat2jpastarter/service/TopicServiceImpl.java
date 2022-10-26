package com.training.minebrat.minebrat2jpastarter.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.minebrat.minebrat2jpastarter.entity.Topic;
import com.training.minebrat.minebrat2jpastarter.repository.TopicRepository;

@Service
public class TopicServiceImpl implements  TopicService{
	
	@Autowired
	TopicRepository topicRepository;
	
//	List<Topic>topicsList =  new ArrayList<>(Arrays.asList(new Topic("111","spiderman","saving earth"),
//				new Topic("123","thor","saving galaxy")));
	@Override
	public List<Topic> getAllTopics() {
		
//		return  topicsList;
		return topicRepository.findAll();
	}

	@Override
	public Topic getTopic(String id ) { //111, 123 420
//	Topic output = new Topic();
//		for(int i = 0; i<topicsList.size();i++) {
//			Topic topic = topicsList.get(i);
//			if(topic.getId().equals(id)) {
//				return topic;
//			}
//		}
//		return null;
		return topicRepository.findById(id).get();
	}

	@Override
	public void deleteTopic(String id) {
//		topicsList.removeIf(t -> t.getId().equals(id));
		topicRepository.deleteById(id);
		
	}

	@Override
	public void updateTopic(String id,Topic updatedTopic) {
//		for(int i = 0; i<topicsList.size();i++) {
//			Topic topic = topicsList.get(i);
//			if(topic.getId().equals(id)) {
//				topicsList.set(i, updatedTopic);
//			}
//		}
		topicRepository.save(updatedTopic);
		//it will check id exists or not
		//exists na, update
		//not exists na, create
		
	}

	@Override
	public void addTopic(Topic topic) {
//		topicsList.add(topic);
		topicRepository.save(topic);
	}

	
	
}
