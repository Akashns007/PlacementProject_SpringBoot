package com.tnsif.PlacementProject;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
//@ComponentScan(basePackages = {"com.tnsif.Controllers.*","com.tnsif.Repositories.CollegeRepository","com.tnsif.Entities.College","com.tnsif.Services.*"})
public class PlacementProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlacementProjectApplication.class, args);
	}

}
