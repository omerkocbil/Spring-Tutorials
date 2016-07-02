package com.omerkocbil;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.omerkocbil.dao.PersonelDAO;
import com.omerkocbil.enterprise.Personel;

public class Merkez {
	
	public static void main(String[] args){
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		PersonelDAO dao = context.getBean(PersonelDAO.class);
		
		Personel personel = new Personel("Burak", 12);
		dao.ekle(personel);
		
		personel = dao.idAra(1);
		System.out.println(personel);
		
		personel = dao.adiAra("Burak");
		System.out.println(personel);
		
		context.close();
	}
	
}
