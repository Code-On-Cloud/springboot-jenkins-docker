package com.manas.springbootjenkinsdocker;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootJenkinsDockerApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringbootJenkinsDockerApplication.class);
	
	@GetMapping("/getMessage")
	public String getMessage() {
		return "Hi... This is a SpringBoot project";
	} 
	
	@PostConstruct
	public void init() {
		logger.info("My application started  !!!!");
		logger.info("Hello World  !!!!");
	}
	
	public static void main(String[] args) {
		logger.info("My application executed  !!!!");
		SpringApplication.run(SpringbootJenkinsDockerApplication.class, args);
	}

}
