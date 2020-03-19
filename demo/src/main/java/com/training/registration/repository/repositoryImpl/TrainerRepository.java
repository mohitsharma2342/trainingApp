package com.training.registration.repository.repositoryImpl;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.registration.entities.Trainer;

@Repository
public interface TrainerRepository extends CrudRepository<Trainer,Integer>{

	
}
