package com.manas.springbootjenkinsdocker;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJenkinsDockerApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringbootJenkinsDockerApplication.class);
	
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
