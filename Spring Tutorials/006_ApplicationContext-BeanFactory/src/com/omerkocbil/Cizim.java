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
		
		// FileSystemXmlApplicationContext yapılandırma dosyanın tam yolunu ister ClassPathXmlApplicationContext ise sadece adını ister.
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring.xml"}); //String dizi kullanılmasının nedeni birden çok yapılandırma dosyasının aynı anda kullanılabileceğini göstermek. String dizi kullanmadan da direk isim verilebilirdi.
		BeanFactory beanfactory = context;
		
		Ucgen ucgen = (Ucgen) beanfactory.getBean("ucgen");
		ucgen.ciz();
	}
	
}
