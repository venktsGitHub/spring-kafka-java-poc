package com.ventech.spring.kafka.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ventech.spring.kafka.main.service.ProducerService;

@RestController
@RequestMapping("api/kafka")
public class KafkaController {
	
	@Autowired
	private ProducerService pService;

	@GetMapping("/message")
	public String sendToKafka(@RequestParam("message") String message) {
		
		pService.sendToKafka(message);
		
		return "Message Sent to Kafka";
	}
}
