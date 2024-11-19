package com.sam.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sam.app.Desktop;

@Configuration
public class AppConfig {
	@Bean
	public Desktop desktop() {
		return new Desktop();
	}

}
