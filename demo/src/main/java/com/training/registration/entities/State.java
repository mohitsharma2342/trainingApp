package com.training.registration.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class State {
	
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer state_id;
	
	@Column(name = "state")
	private String stateName;
	
	@Column(name = "created_by")
	private Date createdBy;
	
	@Column(name = "updated_by")
	private Date updatedBy;	
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name = "updated_date")
    private Date updatedDate;

	@OneToMany(fetch=FetchType.LAZY, targetEntity=City.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "state_id", referencedColumnName="state_id")
	private List<City> cities;
	
	
	

	public Integer getState_id() {
		return state_id;
	}

	public void setState_id(Integer state_id) {
		this.state_id = state_id;
	}

	

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
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
