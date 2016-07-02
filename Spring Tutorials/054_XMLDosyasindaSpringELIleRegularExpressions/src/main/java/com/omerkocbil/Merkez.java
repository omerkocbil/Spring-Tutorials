package com.omerkocbil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Listeler listeler = context.getBean(Listeler.class);
		System.out.println(listeler);
		
		RegExKontrol regExKontrol = context.getBean(RegExKontrol.class);
		System.out.println(regExKontrol);
		
		((ConfigurableApplicationContext)context).close();
		
	}
	
}
