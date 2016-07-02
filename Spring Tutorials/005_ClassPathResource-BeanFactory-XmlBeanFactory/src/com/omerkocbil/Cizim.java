package com.omerkocbil;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class Cizim {
	
	public static void main(String[] args){
		
		// ClassPathResource sınıfı spring.xml yapılandırma dosyası src nin hemen altında ise kullanılır.
		BeanFactory beanfactory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
		
		Ucgen ucgen = (Ucgen) beanfactory.getBean("ucgen");
		ucgen.ciz();
	}
	
}
