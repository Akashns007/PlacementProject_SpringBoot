package com.tnsif.PlacementProject.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Placement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long placementId;

    @ManyToOne
    private College college;

    private String companyName;
    private String jobRole;
    
    
    
	public Placement() {
	}
	
	public Placement(Long placementId, College college, String companyName, String jobRole) {
		super();
		this.placementId = placementId;
		this.college = college;
		this.companyName = companyName;
		this.jobRole = jobRole;
	}
	public Long getPlacementId() {
		return placementId;
	}
	public void setPlacementId(Long placementId) {
		this.placementId = placementId;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getJobRole() {
		return jobRole;
	}
	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}
	@Override
	public String toString() {
		return "Placement [placementId=" + placementId + ", college=" + college + ", companyName=" + companyName
				+ ", jobRole=" + jobRole + "]";
	}

    
	
}