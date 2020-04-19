package com.training.registration.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

	
	@Autowired
	KafkaTemplate<String, String> kfkaTemplate;
	
	public void pushMessage(String producerMessage) {
		kfkaTemplate.send("KafkaProducer", producerMessage);
	}
	
}
