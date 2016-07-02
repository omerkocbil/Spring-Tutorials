package com.omerkocbil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Yazar yazar = context.getBean("beanYazar" ,Yazar.class);
		
		System.out.println(yazar.getAdi() + " " + yazar.getSoyadi());
		System.out.println(yazar.getKitap().getEserAdi());
		System.out.println(yazar.getKitap().getEserISBN());
		System.out.println(yazar.getBilgi());
		
		((ConfigurableApplicationContext)context).close();
		
	}
	
}
