package com.tnsif.PlacementProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
//@ComponentScan(basePackages = {"com.tnsif.Controllers.*","com.tnsif.Repositories.CollegeRepository","com.tnsif.Entities.College","com.tnsif.Services.*"})
public class PlacementProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlacementProjectApplication.class, args);
	}

}
