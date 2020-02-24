package com.tts.EcommerceProject.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.tts.EcommerceProject.service.UserService;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
@Autowired
private UserService userService;
@Autowired
private BCryptPasswordEncoder bCryptPasswordEncoder;

protected void configure(AuthenticationManagerBuilder auth) throws Exception {
 auth.userDetailsService(userService).passwordEncoder(bCryptPasswordEncoder);
}

protected void configure(HttpSecurity http) throws Exception {
 http
     .authorizeRequests()
     .antMatchers("/").permitAll()
     .antMatchers("/console/**").permitAll()
         .antMatchers("/cart").authenticated()
     .and().formLogin()
         .loginPage("/signin")
         .loginProcessingUrl("/login")
     .and().logout()
         .logoutRequestMatcher(new AntPathRequestMatcher("/signout"))
         .logoutSuccessUrl("/");
 
 	http.csrf().disable();
	http.headers().frameOptions().disable();
 
	}
}