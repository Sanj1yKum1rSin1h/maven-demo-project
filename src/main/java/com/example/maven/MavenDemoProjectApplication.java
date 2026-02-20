package com.example.maven;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class MavenDemoProjectApplication {

	public static void main(String[] args) {
		log.info("Test 1 github repo integrated with jenkins");
		SpringApplication.run(MavenDemoProjectApplication.class, args);
	}

}
