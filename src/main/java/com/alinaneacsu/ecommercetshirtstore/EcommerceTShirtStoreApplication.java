package com.alinaneacsu.ecommercetshirtstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class EcommerceTShirtStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceTShirtStoreApplication.class, args);
	}

}
