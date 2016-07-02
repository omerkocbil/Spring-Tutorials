package com.omerkocbil;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	
	public static void main(String[] args){
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		// bean PersonelServisImpl sınıfına ait olabilir interface i ile çağırıp kullanacağız
		IPersonelServis personelServis = (IPersonelServis) context.getBean("beanPersonelServis");
		
		try{
			personelServis.adiSoyadiKontrolEt();
		} catch(Exception e){
			System.out.println("PersonelServis in adiSoyadiKontrolEt() metodunda exception oluştu");
		}
		
		personelServis.selamVer("Hoşgeldiniz");
		personelServis.personelBilgisiniVer();
	}
	
}
