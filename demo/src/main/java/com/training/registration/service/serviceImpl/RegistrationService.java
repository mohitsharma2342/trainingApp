package com.training.registration.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.registration.entities.Registration;
import com.training.registration.repository.repositoryImpl.CoordinatorRepository;
import com.training.registration.repository.repositoryImpl.TraineeRepository;
import com.training.registration.repository.repositoryImpl.TrainerRepository;

@Service
public class RegistrationService {

	
	
	@Autowired
	private CoordinatorRepository coordinatorRepository;
	
	@Autowired
	private TraineeRepository traineeRepository;
	
	@Autowired
	private TrainerRepository trainerRepository;
	
	public void save(Registration registration) {
		if(registration.getCoordinator()!=null) {
			coordinatorRepository.save(registration.getCoordinator());
		}else if(registration.getTrainee()!=null) {
			traineeRepository.save(registration.getTrainee());
		}else {
			trainerRepository.save(registration.getTrainer());
		}
		
       
	}

	
	
}
