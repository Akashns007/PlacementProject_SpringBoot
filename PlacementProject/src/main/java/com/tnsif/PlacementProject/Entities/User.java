package com.tnsif.PlacementProject.Entities;



import com.tnsif.PlacementProject.Extras.UserType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long UserId;
	
	private String Username;
	private String Password;
	private UserType Type;
	
	
	
	
	public User() {
	}
	
	public Long getUserId() {
		return UserId;
	}
	public User(Long userId, String username, String password) {
	super();
	UserId = userId;
	Username = username;
	Password = password;
}
	public void setUserId(Long userId) {
		UserId = userId;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", Username=" + Username + ", Password=" + Password + "]";
	}
	
	
	
}
