package com.training.registration.repository.repositoryImpl;

import org.springframework.data.repository.CrudRepository;

import com.training.registration.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{

	User findUserByEmail(String email);

	
}
