package com.manas.springbootjenkinsdocker;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootJenkinsDockerApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringbootJenkinsDockerApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("Test case executing  !!!");
		assertEquals(true, true);
	}

}
