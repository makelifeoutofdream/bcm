package com.bcm.config.oauth;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

@EnableResourceServer
public class ResourceServer extends ResourceServerConfigurerAdapter{

	@Override
    public void configure(HttpSecurity http) throws Exception {
		http
        .authorizeRequests()
           .antMatchers("/register/**").permitAll()
           .anyRequest().access("#oauth2.hasScope('read')");
        
    }
	
	@Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
         resources.resourceId("resource");
    }
	
	
}
