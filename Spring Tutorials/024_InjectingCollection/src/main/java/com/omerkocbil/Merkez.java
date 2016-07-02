package com.omerkocbil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Ogrenci ogrenci = context.getBean(Ogrenci.class);
		
		ogrenci.getOgrenciList();
		ogrenci.getOgrenciSet();
		ogrenci.getOgrenciMap();
		ogrenci.getOgrenciProp();
		
		//işimiz bitince context i kapatma kodu
		((ConfigurableApplicationContext)context).close();
		
	}
	
}
