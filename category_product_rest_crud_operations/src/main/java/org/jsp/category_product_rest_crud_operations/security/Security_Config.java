package org.jsp.category_product_rest_crud_operations.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import jakarta.servlet.FilterChain;

@Configuration
@EnableMethodSecurity
public class Security_Config {

	@Bean
	public FilterChain config(HttpSecurity httpSecurity)throws Exception{
		
		
	}
}
