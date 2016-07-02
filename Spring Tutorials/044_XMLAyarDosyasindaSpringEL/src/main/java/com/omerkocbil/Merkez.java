package com.omerkocbil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Yazar yazar = context.getBean(Yazar.class);
		
		System.out.println(yazar.getAdi() + " " + yazar.getSoyadi());
		System.out.println(yazar.getKitap().getEserAdi());
		System.out.println(yazar.getKitap().getEserISBN());
		
		((ConfigurableApplicationContext)context).close();
		
	}
	
}
