package com.omerkocbil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	public static void main(String[] args){
		
		// Anotasyonları kullandığımız için AnnotationConfigApplicationContext sınıfını kullandık. İçine de konfigürasyonları yaptığımız sınıfı verdik.
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		IMerhaba obj = (IMerhaba) context.getBean("merhaba");
		obj.mesajYaz("Güzel gören, güzel düşünür.\n" + "Güzel düşünen, hayatından lezzet alır.");
	}
	
}
