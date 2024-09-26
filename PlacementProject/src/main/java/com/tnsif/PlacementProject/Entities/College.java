package com.tnsif.PlacementProject.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long collegeId;

    private String name;
    private String location;
    private String contact;

	

	public College() {
	}


	public College( Long collegeId, String name,
			String location, String contact) {
		super();
		this.collegeId = collegeId;
		this.name = name;
		this.location = location;
		this.contact = contact;
	}


	public Long getCollegeId() {
		return collegeId;
	}


	public void setCollegeId(Long collegeId) {
		this.collegeId = collegeId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", name=" + name + ", location=" + location
				+ ", contact=" + contact + "]";
	}
    
 
}