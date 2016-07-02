package com.omerkocbil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		TernaryOperator ternaryOperator = context.getBean(TernaryOperator.class);
		
		System.out.println(ternaryOperator);
		
		((ConfigurableApplicationContext)context).close();
		
	}
	
}
