package com.training.registration.controller;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.registration.service.serviceImpl.KafkaProducerService;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaRest {

	@Autowired
	private KafkaProducerService kafkaProducerService;
	
	
	@GetMapping
	public String name(@QueryParam("message") String message) {
		kafkaProducerService.pushMessage(message);
		return message;
	}
	
}
