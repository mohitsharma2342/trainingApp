package com.training.registration.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Trainee {
	
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer id;
	
	@OneToOne(targetEntity = Profile.class,cascade = CascadeType.ALL)
	@JoinColumn(name="profile_id",referencedColumnName = "id")
	private Profile profile; 
	

	@OneToOne(targetEntity = User.class,cascade = CascadeType.ALL)
	@JoinColumn(name="user_id",referencedColumnName = "id")
	private User user;
		
	@Column(name = "hightest_qualification")
	private String qualification;	
	
	@Column(name = "primary_skill")	
	private String primaySkill;
	
	@Column(name = "created_by")
	private Date createdBy;
	
	@Column(name = "updated_by")
	private Date updatedBy;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name = "updated_date")
	private Date updatedDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPrimaySkill() {
		return primaySkill;
	}

	public void setPrimaySkill(String primaySkill) {
		this.primaySkill = primaySkill;
	}

	public Date getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Date createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Date updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
}
