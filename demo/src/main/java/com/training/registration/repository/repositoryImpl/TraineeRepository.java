package com.training.registration.repository.repositoryImpl;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.registration.entities.Trainee;

@Repository
public interface TraineeRepository extends CrudRepository<Trainee,Integer>{

	
}
