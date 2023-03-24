package com.luv2code.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*@SpringBootApplication(
		scanBasePackages = {"com.luv2code.springcoredemo",  // util, springcoredemonun içinde olmadığı için bu kodu yazdık.
							"com.luv2code.Config"})*/
@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
