package com.omerkocbil;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Merkez {
	
	public static void main(String[] args){
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.register(SpringBeansConfig.class);
		context.refresh();
		
		Ogrenci ogrenci = context.getBean(Ogrenci.class);
		
		System.out.println(ogrenci.getAdi());
		System.out.println(ogrenci.getSoyadi());
		System.out.println(ogrenci.getSehir().getPlakaNo());
		System.out.println(ogrenci.getSehir().getSehirAdi());
		
		((ConfigurableApplicationContext)context).close();
		
	}
	
}
