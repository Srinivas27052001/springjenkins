package com.example.jenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringJenkinsApplication {

	private static final org.slf4j.Logger log = LoggerFactory.getLogger(SpringJenkinsApplication.class);


	@PostConstruct
	public void intt()
	{
		log.info("Application Started")
		;
		log.info("Application started second");
	}


	@GetMapping("/ping")
	public String message(){

     log.info("Application Started");
	 log.info("You use application");

		return "Wao!! Application Deployed successfully in SAP Cloud..";
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
