package com.example.maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavenDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenDemoProjectApplication.class, args);
		System.out.println("Jenkins integration...");
		System.out.println("Test 1");
		System.out.println("test 2 running");
	}

}
