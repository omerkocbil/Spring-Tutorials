package com.omerkocbil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Personel personel = context.getBean(Personel.class);
		
		System.out.println(personel);
		
		//işimiz bitince context i kapatma kodu
		((ConfigurableApplicationContext)context).close();
		
	}
	
}
