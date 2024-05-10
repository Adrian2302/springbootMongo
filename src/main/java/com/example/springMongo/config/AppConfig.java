package com.example.springMongo.config;

import com.example.springMongo.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UserService userService() {
        return new UserService();
    }

    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }
}
