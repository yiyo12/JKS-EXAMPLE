package com.jkstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
@EnableWebSecurity
public class JksTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JksTestApplication.class, args);
	}

//	@Bean
//	public WebSecurityConfigurerAdapter webSecurityConfigurerAdapter() {
//		return new WebSecurityConfigurerAdapter() {
//			@Override
//			protected void configure(HttpSecurity http) throws Exception {
//				http.requiresChannel().anyRequest().requiresSecure();
//			}
//		};
//	}

}
