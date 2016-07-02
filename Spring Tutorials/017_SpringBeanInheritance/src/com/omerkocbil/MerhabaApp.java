package com.omerkocbil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MerhabaApp {
	
	public static void main(String[] args){	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Merhaba nesne1 = (Merhaba) context.getBean("merhaba");
		System.out.println(nesne1.getMesaj1() + "\n" + nesne1.getMesaj2());
		
		System.out.println("\n");
	
		Yazar nesne2 = (Yazar) context.getBean("yazar");
		System.out.println(nesne2.getMesaj1() + "\n" + nesne2.getMesaj2() + "\n" + nesne2.getMesaj3());
		
	}
}
