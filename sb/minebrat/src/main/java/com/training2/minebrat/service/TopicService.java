package com.training2.minebrat.service;

import java.util.List;

import com.training2.minebrat.entity.Topic;

public interface TopicService {

	List<Topic> getAllTopics();

	Topic getTopic(String id );
}
