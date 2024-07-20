package com.basictest.building_mario;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LearningSpringConfiguration {
    @Bean
    public String name(){
        return "Aryan";
    }
}
