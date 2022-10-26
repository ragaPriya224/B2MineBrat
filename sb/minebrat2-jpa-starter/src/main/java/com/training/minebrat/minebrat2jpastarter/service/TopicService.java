package com.training.minebrat.minebrat2jpastarter.service;

import java.util.List;

import com.training.minebrat.minebrat2jpastarter.entity.Topic;

public interface TopicService {

	List<Topic> getAllTopics();

	Topic getTopic(String id );

	void deleteTopic(String id);

	void updateTopic(String id,Topic topic);

	void addTopic(Topic topic);
}
