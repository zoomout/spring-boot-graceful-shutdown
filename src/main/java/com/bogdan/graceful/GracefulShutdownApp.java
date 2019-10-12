package com.bogdan.graceful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GracefulShutdownApp {

	public static void main(String[] args) {
		SpringApplication.run(GracefulShutdownApp.class, args);
	}

}
