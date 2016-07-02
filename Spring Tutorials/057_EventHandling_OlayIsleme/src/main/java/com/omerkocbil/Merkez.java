package com.omerkocbil;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	
	public static void main(String[] args){
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		context.start();
		
		Sozler sozler = context.getBean(Sozler.class);
		sozler.ekranaYaz();
		
		context.stop();
		
		context.close();
		
	}
	
}
