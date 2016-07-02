package com.omerkocbil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MerhabaApp {
	
	public static void main(String[] args){	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Merhaba nesne1 = (Merhaba) context.getBean("merhaba");
		nesne1.setMesaj("İsmail Abi");
		nesne1.goster();
		
		((AbstractApplicationContext)context).registerShutdownHook();
		//Yukarıdaki kod bean sonlandırıldıktan sonra bir metodun çalışması için yazılmıştır ve en sonda bulunması gerekmektedir.
	}
}
