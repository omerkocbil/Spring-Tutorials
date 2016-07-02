package com.omerkocbil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Ogrenci ogrenci = context.getBean(Ogrenci.class);
		System.out.println("Adı : " + ogrenci.getAdi());
		System.out.println("Soyadı : " + ogrenci.getSoyadi());
		System.out.println("Yaşı : " + ogrenci.getYasi());
	}
	
}
