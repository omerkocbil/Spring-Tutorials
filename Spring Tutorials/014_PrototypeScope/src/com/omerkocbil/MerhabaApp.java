package com.omerkocbil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MerhabaApp {
	
	public static void main(String[] args){	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Merhaba nesne1 = (Merhaba) context.getBean("merhaba");
		nesne1.setMesaj("İsmail Abi");
		nesne1.goster();
		
		Merhaba nesne2 = (Merhaba) context.getBean("merhaba");
		nesne2.getMesaj();
		nesne2.goster();
		
	}
}
