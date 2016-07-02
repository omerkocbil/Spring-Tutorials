package com.omerkocbil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.omerkocbil.config.MerkezAppConfig;

public class MerkezApp {
	
	public static void main(String[] args){
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MerkezAppConfig.class);
		
		A a = (A) context.getBean("beana");
		a.yaz("İsmail");
		
		B b = (B) context.getBean("beanb");
		b.yaz("Abi");
		
	}
	
}
