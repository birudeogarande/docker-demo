package com.saatvik;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyAppApplication {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	public static void main(String[] args) {
		SpringApplication.run(MyAppApplication.class, args);
		
	}

	@GetMapping("/hello")
	public String gretting() {
		logger.info("Calling hello API");
		return "Hello, Welcome to docker demo";
	}
}
