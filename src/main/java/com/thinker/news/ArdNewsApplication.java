package com.thinker.news;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({ "classpath:hessian/hessian-client.xml" })
public class ArdNewsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArdNewsApplication.class, args);
	}
}
