package com.training.registration.service.serviceImpl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.training.registration.entities.User;
import com.training.registration.repository.repositoryImpl.UserRepository;

@Component(value = "userDetailService")
public class UserDetailServiceImpl implements UserDetailsService{
	
	
	@Autowired
	private UserRepository userRepository;

	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		com.training.registration.entities.User user = userRepository.findUserByEmail(email);
		
		System.out.println(user.getEmail());
		if(user == null){
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),
		getAuthority(user));
	}

	private List getAuthority(User user) {
		return Arrays.asList(new SimpleGrantedAuthority(user.getUserRoles().getRoleName()));
	}

	public List<User> getUsers() {
		return (List<User>) userRepository.findAll();
	}

	public User checkUserExist(String emailId) {
		return  userRepository.findUserByEmail(emailId);
	}

}
