package com.sam.app;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sam.app.config.AppConfig;

@SpringBootApplication
public class MyAppApplication {

    public static void main(String[] args) {

    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Desktop dt = context.getBean(Desktop.class);
    	dt.compile();
    	
    	
    	
    	
    	
    	
    	
    	

//        ApplicationContext context = SpringApplication.run(MyAppApplication.class, args);
//        Dev dev = context.getBean(Dev.class);
//        dev.build();
    }

	

}
