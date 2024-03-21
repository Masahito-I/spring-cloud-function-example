package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.function.Function;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@Bean
	public Function<String, String> uppercase() {
		return value -> {
			String response = value + " WORLD !!";
			System.out.println(response);
            return response.toUpperCase();
        };
	}
}
