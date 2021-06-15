package com.egen;

import org.springframework.context.annotation.ComponentScan;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
@ComponentScan
@EnableWebMvc
public class AppConfig extends WebMvcConfigurationSupport {
	//TODO: override addCorsMappings Method to allow cross origin request to API

    @Override
    protected void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }
}
