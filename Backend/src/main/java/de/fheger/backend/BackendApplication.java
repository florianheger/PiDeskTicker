package de.fheger.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"de.fheger.backend.repository"})
@EntityScan("de.fheger.backend.model")
public class BackendApplication {
	//@EnableJpaRepositories(basePackages = {"com.ausbildungsrunde.restbildungsrunde.repository"})
	//@EntityScan("com.ausbildungsrunde.restbildungsrunde.model")
	public BackendApplication() {

	}

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
