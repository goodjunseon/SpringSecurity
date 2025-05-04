package com.example.SpringSecurityByJunSeon;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityByJunSeonApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load(); // .env 파일 로드
		System.setProperty("DB_USERNAME",dotenv.get("DB_USERNAME"));
		System.setProperty("DB_PASSWORD",dotenv.get("DB_PASSWORD"));
//		System.setProperty("JWT_SECRET",dotenv.get("JWT_SECRET"));

		SpringApplication.run(SpringSecurityByJunSeonApplication.class, args);

	}

}
