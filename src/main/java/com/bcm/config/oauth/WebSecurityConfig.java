package com.bcm.config.oauth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/*@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)*/
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	/*
	
	*//**
		 * Constructor disables the default security settings
		 *//*
			 * public WebSecurityConfig() { super(true); }
			 * 
			 * @Override public void configure(WebSecurity web) throws Exception {
			 * web.ignoring().antMatchers("/register/**"); }
			 * 
			 * @Override public void configure(HttpSecurity http) throws Exception { http
			 * .authorizeRequests() .antMatchers("/register").permitAll()
			 * .anyRequest().access("#oauth2.hasScope('read')");
			 * 
			 * }
			 * 
			 * @Bean
			 * 
			 * @Override public AuthenticationManager authenticationManagerBean() throws
			 * Exception { return super.authenticationManagerBean(); }
			 * 
			 */
	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}


}