package com.omerkocbil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Calisan calisan = context.getBean(Calisan.class);
		System.out.println(calisan.getSehir().getSehirAdi());
		
		((ConfigurableApplicationContext)context).close();
		
	}
	
}
