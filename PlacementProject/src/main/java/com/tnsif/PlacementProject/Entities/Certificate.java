package com.tnsif.PlacementProject.Entities;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Certificate {

    @Id
    private Long certificateId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "student_student_id")
    @JsonIgnore
    private Student student;

    private String courseName;
    private Date dateIssued;
    private Long studentId;
   
    
    public Certificate() {
	}

	public Certificate(Long certificateId, Student student, String courseName, Date dateIssued) {
		super();
		this.certificateId = certificateId;
		this.student = student;
		this.courseName = courseName;
		this.dateIssued = dateIssued;
	}
	
	
	

	public Long getCertificateId() {
		return certificateId;
	}
	public void setCertificateId(Long certificateId) {
		this.certificateId = certificateId;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Date getDateIssued() {
		return dateIssued;
	}
	public void setDateIssued(Date dateIssued) {
		this.dateIssued = dateIssued;
	}
	@Override
	public String toString() {
		return "Certificate [certificateId=" + certificateId + ", student=" + student + ", courseName=" + courseName
				+ "]";
	}

	 public Long getStudentId() {
	        return student.getStudentId();
	    }

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

    
}