package com.sammidev.belajar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sammidev.belajar.web")
public class BelajarApplication {

	public static void main(String[] args) {
		SpringApplication.run(BelajarApplication.class, args);
	}

}
