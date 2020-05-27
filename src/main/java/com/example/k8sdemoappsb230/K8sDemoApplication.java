package com.example.k8sdemoappsb230;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class K8sDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8sDemoApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		String retVal = "Wowzwers!";
		return retVal;
	}

}
