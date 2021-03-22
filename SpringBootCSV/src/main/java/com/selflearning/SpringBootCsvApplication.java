package com.selflearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class SpringBootCsvApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCsvApplication.class, args);
	}

}
