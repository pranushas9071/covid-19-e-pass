package com.covid.epass.secure;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class Security extends WebSecurityConfigurerAdapter{
	@Bean
	@Override
	protected UserDetailsService userDetailsService() {
		List<UserDetails> users=new ArrayList<>();
		users.add(User.withDefaultPasswordEncoder().username("pranusha").password("0000").roles("ADMIN").build());
		users.add(User.withDefaultPasswordEncoder().username("abcd").password("1234").roles("ADMIN").build());
		
        return new InMemoryUserDetailsManager(users);
}
	protected void configure(HttpSecurity http) throws Exception {
		  http
		      .authorizeRequests()                                          
		      .antMatchers("/adminVerify").hasRole("ADMIN")
		      .antMatchers("/aadhar.jsp","/aadhar","/status.jsp","/status","/g0/**","/generate-pdf-and-provide-e-pass/**","/reject/**").authenticated()
		      .anyRequest().permitAll()
		      .and()
		      .csrf().disable()
		      .formLogin()
		      .loginPage("/login") 
	          .permitAll()
	          .and()  
	          .httpBasic()  
	          .and()
	          .logout()  
	          .logoutUrl("/security_logout")  
	          .logoutSuccessUrl("/");
		}
}
