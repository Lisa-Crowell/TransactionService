package com.fintechdemo.webapp.transactionservice.security;

import com.fintechdemo.webapp.transactionservice.services.AuthorizationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Description;
import org.springframework.core.env.Environment;

import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.ws.rs.HttpMethod;

/**
 * The application's security configuration class.
 *
 * @author Lisa Crowell <lisa.l.crowell@gmail.com>
 */
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
@Slf4j
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	private final Environment environment;
	private final AuthorizationService authorizationService;

	public SecurityConfig(Environment environment, AuthorizationService authorizationService) {
		this.environment = environment;
		this.authorizationService = authorizationService;
	}

	@Description("Configure HTTP Security")
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.cors()
				.and().authorizeRequests()
				.antMatchers("/swagger-ui/**").permitAll()
				.antMatchers("/transactions", HttpMethod.POST).permitAll()
				.anyRequest().permitAll()
				.and()
				.addFilter(new AuthorizationFilter(authenticationManager(), environment, authorizationService));
		http.headers().frameOptions().disable();
	}
}