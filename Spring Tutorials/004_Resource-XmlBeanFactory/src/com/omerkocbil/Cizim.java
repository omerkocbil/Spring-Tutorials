package com.omerkocbil;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class Cizim {
	
	public static void main(String[] args){
		
		// FileSystemResource sınıfı spring.xml yapılandırma dosyası src dizininde değil ise kullanılır. 
		BeanFactory beanfactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		Ucgen ucgen = (Ucgen) beanfactory.getBean("ucgen");
		ucgen.ciz();
	}
	
}
