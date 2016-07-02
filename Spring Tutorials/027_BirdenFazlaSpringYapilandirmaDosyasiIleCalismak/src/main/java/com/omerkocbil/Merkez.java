package com.omerkocbil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.omerkocbil.musteri.Musteri;

public class Merkez {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansTumModuller.xml");
		
		Musteri musteri = context.getBean(Musteri.class);
		
		System.out.println("ADI     : " + musteri.getAdi());
		System.out.println("SOYADI  : " + musteri.getSoyadi());
		System.out.println("ADRES   : " + musteri.getAdres().getAdres());
		
		//işimiz bitince context i kapatma kodu
		((ConfigurableApplicationContext)context).close();
		
	}
	
}
