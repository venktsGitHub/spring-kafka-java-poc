package com.ventech.spring.kafka.main.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
	
	
	@KafkaListener(topics="first_topic", groupId = "new_group")
	public void kafkaListenerMethod(String message) {
		
		System.out.println("I got the Message "+message);
	}

}
