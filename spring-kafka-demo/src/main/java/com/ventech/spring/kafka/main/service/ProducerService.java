package com.ventech.spring.kafka.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
	
	@Autowired
	private KafkaTemplate<String,  String> template;

	public void sendToKafka(String message) {
		
		template.send("first_topic", message);
	}
	
	
	

}
