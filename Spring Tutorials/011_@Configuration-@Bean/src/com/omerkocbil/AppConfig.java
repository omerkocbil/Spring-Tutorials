package com.omerkocbil;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class AppConfig {
	
	@Bean(name="merhaba")
	public IMerhaba mesajYaz(){
		return new MerhabaImpl();
	}
	
}
