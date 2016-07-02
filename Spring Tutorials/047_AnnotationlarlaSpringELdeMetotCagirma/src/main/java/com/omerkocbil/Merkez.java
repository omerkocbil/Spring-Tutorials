package com.omerkocbil;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	
	public static void main(String[] args){
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Yazar yazar = context.getBean(Yazar.class);
		
		System.out.println(yazar.getAdi() + " " + yazar.getSoyadi());
		System.out.println(yazar.getKitapAdi());
		System.out.println(yazar.getKitap().getEserISBN());
		System.out.println(yazar.getBilgi());
		
		context.close();
		// Bu şekilde de olur yukarıda context i o şekilde tanımlarsak burda cast e gerek kalmaz
		
	}
	
}
