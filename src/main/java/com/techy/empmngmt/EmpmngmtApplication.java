package com.techy.empmngmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class EmpmngmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpmngmtApplication.class, args);
	}
}
