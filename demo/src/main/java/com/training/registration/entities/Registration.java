package com.training.registration.entities;

public class Registration {
	
	private User user;
	private Profile profile;
	private Trainee trainee;
	private Trainer trainer;
	private Coordinator coordinator;
	
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	public Trainee getTrainee() {
		return trainee;
	}
	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	public Coordinator getCoordinator() {
		return coordinator;
	}
	public void setCoordinator(Coordinator coordinator) {
		this.coordinator = coordinator;
	}
	
	
}
