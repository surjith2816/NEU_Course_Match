package com.northeastern.coursematch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// loads spring boot application inside the server container
@SpringBootApplication
public class CourseMatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseMatchApplication.class, args);
	}

}
