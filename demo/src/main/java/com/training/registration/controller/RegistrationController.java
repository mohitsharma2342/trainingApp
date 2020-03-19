package com.training.registration.controller;

import java.util.List;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.registration.entities.Registration;
import com.training.registration.entities.User;
import com.training.registration.service.serviceImpl.RegistrationService;
import com.training.registration.service.serviceImpl.UserDetailServiceImpl;
@CrossOrigin
@RestController
@RequestMapping("/Registration")
public class RegistrationController {
	
	@Autowired
	private RegistrationService registrationService;
	
	@Autowired
	private UserDetailServiceImpl userDetailServiceImpl;
	
	@PostMapping
	public void saveUser(@RequestBody Registration registration) {
        registrationService.save(registration);
	}
	
	
	@GetMapping
	public List<User> getUsers() {
		return userDetailServiceImpl.getUsers();
	}
	
	
	@GetMapping
	public ResponseEntity<User> checkUserExist(@QueryParam("emailId") String emailId) {
		User user = userDetailServiceImpl.checkUserExist(emailId);
		if(user!=null) {
			System.out.println(user.getEmail());
			return new ResponseEntity<User>(user,HttpStatus.OK);
		}else {
			System.out.println(user.getEmail());
			return new ResponseEntity<User>(user,HttpStatus.BAD_REQUEST);
		}
	
	}
	
}
