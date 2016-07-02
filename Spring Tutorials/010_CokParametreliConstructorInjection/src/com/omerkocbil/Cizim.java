package com.omerkocbil;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class Cizim {
	
	public static void main(String[] args){
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml"); 
		
		Ucgen ucgen = (Ucgen) applicationContext.getBean("ucgen");
		ucgen.ciz();
	}
	
}
