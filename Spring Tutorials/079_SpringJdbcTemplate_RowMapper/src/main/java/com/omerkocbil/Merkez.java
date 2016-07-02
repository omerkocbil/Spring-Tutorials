package com.omerkocbil;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.omerkocbil.dao.PersonelDAO;
import com.omerkocbil.enterprise.Personel;

public class Merkez {
	
	public static void main(String[] args){
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		PersonelDAO dao = context.getBean(PersonelDAO.class);
		
		Personel personel = null;
		
		System.out.println("NESNEYİ VERİ TABANINA KAYDETME");
		personel = new Personel("Cem", 1);
		dao.ekle(personel);
		System.out.println(personel);
		
		System.out.println();
		
		System.out.println("ID NUMARASI İLE YAPILAN ARAMA");
		personel = dao.idAra(3);
		System.out.println(personel);
		
		System.out.println();
		
		System.out.println("AD İLE YAPILAN ARAMA");
		personel = dao.adiAra("Kadir");
		System.out.println(personel);
		
		System.out.println();
		
		System.out.println("ID İLE STRING BİR VERİYİ ÇEKME");
		String data = dao.idDegeriyleStringBirVeriyiCekme(2);
		System.out.println(data);
		
		System.out.println();
		
		System.out.println("BÜTÜN KAYITLARI GETİREN ARAMA");
		for(Personel kayit : dao.butunKayitlariAra()){
			System.out.println(kayit);
		}
		
		context.close();
	}
	
}
