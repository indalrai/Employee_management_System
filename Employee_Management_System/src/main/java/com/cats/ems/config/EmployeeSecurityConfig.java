package com.cats.ems.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SuppressWarnings("deprecation")
@EnableWebSecurity
@Configuration
@EnableWebMvc
public class EmployeeSecurityConfig extends WebSecurityConfigurerAdapter{
	
	   @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http.csrf().disable().cors().disable().authorizeRequests().antMatchers("/**").permitAll().anyRequest().authenticated().and().sessionManagement()
	                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);



	   }
	
	

}
