package com.basictest.building_mario;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LearningSpring {
    public static void main(String[] args) {
        //Launch a spring context
        //Config things we want spring to manage - @Configuration Class, @Bean
        // WE CAN DEFINE SPRING BEANS HERE
        //Launched a context
        var context = new AnnotationConfigApplicationContext(LearningSpringConfiguration.class);


        //Retrieving beans managed by spring
        System.out.println(context.getBean("name"));
    }
}

