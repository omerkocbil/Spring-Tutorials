package com.omerkocbil;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	
	public static void main(String[] args){
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		// Aşağıda class olarak PersonelServis ama bean olarak proxy olanı yazılıyor. Dikkat!!
		PersonelServis personelServis = context.getBean("beanPersonelServisProxy", PersonelServis.class);
		try{
			personelServis.adiSoyadiKontrolEt();
		} catch(Exception e){
			System.out.println("PersonelServis in adiSoyadiKontrolEt() metodunda exception oluştu");
		}
		personelServis.selamVer("Hoşgeldiniz");
		personelServis.personelBilgisiniVer();
		
		//Sadece ayar dosyasında pattern i verdiğimiz ve o pattern e uyan metodun tüm özelliklerini getirdi. 
		//Diğerlerini sadece gerçekleştirdi.
	}
	
}
