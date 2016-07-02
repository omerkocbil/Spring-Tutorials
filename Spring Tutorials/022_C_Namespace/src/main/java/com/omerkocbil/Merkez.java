package com.omerkocbil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		//1.YOL
		//Calisan calisan = (Calisan) context.getBean("beanCalisan");
		
		//2.YOL
		//Calisan calisan = context.getBean("beanCalisan", Calisan.class);
		
		//3.YOL
		Calisan calisan = context.getBean(Calisan.class);
		
		System.out.println("ADI : " + calisan.getAdi());
		System.out.println("SOYADI : " + calisan.getSoyadi());
		System.out.println("YAŞI : " + calisan.getYasi());
		System.out.println("ŞEHİR : " + calisan.getAdres().getSehir());
		System.out.println("SEMT : " + calisan.getAdres().getSemt());
		System.out.println("MAHALLE : " + calisan.getAdres().getMahalle());
		System.out.println("CADDE : " + calisan.getAdres().getCadde());
		System.out.println("NO : " + calisan.getAdres().getNo());
		System.out.println("DAİRE : " + calisan.getAdres().getDaire());
		
	}
	
}
