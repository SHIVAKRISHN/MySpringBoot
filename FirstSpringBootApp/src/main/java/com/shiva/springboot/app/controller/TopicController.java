package com.shiva.springboot.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shiva.springboot.app.model.Topic;

@RestController
public class TopicController {

	
	@RequestMapping(value="/listTopics")
	public List<Topic> listTopics()
	{
		List<Topic> listTopic= new ArrayList<Topic>();
		
		Topic firstTopic=new Topic(1,"java","collectionFramework");
		Topic secondTopic=new Topic(2,"spring","SpringBootApplication");
		Topic thirdTopic=new Topic(3,"hibernate","HibernateCacheMachenasim");
		
		listTopic.add(firstTopic);
		listTopic.add(secondTopic);
		listTopic.add(thirdTopic);
		
		return listTopic;
		
	}
	
}
