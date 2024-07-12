package com.example.gym_tracker_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class GymTrackerBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymTrackerBackendApplication.class, args);
	}

}

