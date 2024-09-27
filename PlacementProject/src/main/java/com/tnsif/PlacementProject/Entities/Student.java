package com.tnsif.PlacementProject.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    private String email;
    private String contact;
    private String yearOfStudy;
    private String branch;
    private Double cgpa;
    private String placementStatus;
    
    @ManyToOne
    private College college;
    
    @OneToOne
    private User user;
    

    
	public Student() {
	}



	public Student(Long studentId, String email, String contact, String yearOfStudy, String branch, Double cgpa,
			String placementStatus) {
		super();
		this.studentId = studentId;
		this.email = email;
		this.contact = contact;
		this.yearOfStudy = yearOfStudy;
		this.branch = branch;
		this.cgpa = cgpa;
		this.placementStatus = placementStatus;
	}



	public Long getStudentId() {
		return studentId;
	}



	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getContact() {
		return contact;
	}



	public void setContact(String contact) {
		this.contact = contact;
	}



	public String getYearOfStudy() {
		return yearOfStudy;
	}



	public void setYearOfStudy(String yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}



	public String getBranch() {
		return branch;
	}



	public void setBranch(String branch) {
		this.branch = branch;
	}



	public Double getCgpa() {
		return cgpa;
	}



	public void setCgpa(Double cgpa) {
		this.cgpa = cgpa;
	}



	public String getPlacementStatus() {
		return placementStatus;
	}



	public void setPlacementStatus(String placementStatus) {
		this.placementStatus = placementStatus;
	}



	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", email=" + email + ", contact=" + contact + ", yearOfStudy="
				+ yearOfStudy + ", branch=" + branch + ", cgpa=" + cgpa + ", placementStatus=" + placementStatus + "]";
	}
	
	
    
}
