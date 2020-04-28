package com.helmi.paino.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Client {

	@Id
	@GeneratedValue
	private Long id;
	private String userName;
		
	public Client() {
		super();
	}
	
	public Client(Long id, String userName) {
		super();
		this.id = id;
		this.userName = userName;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
