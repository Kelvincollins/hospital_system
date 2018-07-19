package com.collinsk.hospital_system.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	 @Override
		protected void configure(AuthenticationManagerBuilder auth) throws Exception {

			auth.inMemoryAuthentication().withUser("collo").password("{noop}kipkirui92").roles("USER").and().withUser("admin")
					.password("{noop}admin").roles("USER", "ADMIN");

		}

		// Authorization: Role -> Access
	    @Override
		protected void configure(HttpSecurity http) throws Exception {
			http.httpBasic()
			.and().authorizeRequests()
			.antMatchers("/home/list")
			.hasRole("USER").antMatchers("/**")
			.hasRole("ADMIN").and().csrf().disable().headers().frameOptions().disable();
		}
}
