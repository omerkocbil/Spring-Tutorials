package com.omerkocbil;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.omerkocbil.dao.PersonelDAO;
import com.omerkocbil.enterprise.Personel;

public class Merkez {
	
	public static void main(String[] args){
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		PersonelDAO dao = context.getBean(PersonelDAO.class);
		
		Personel personel1 = new Personel("Mimar",7);
		Personel personel2 = new Personel("Semih",4);
		Personel personel3 = new Personel("Ahmet Emre",0);
		Personel personel4 = new Personel("Çağdaş",3);
		Personel personel5 = new Personel("Orhan",9);
		
		List<Personel> personelList = new ArrayList<Personel>();
		personelList.add(personel1);
		personelList.add(personel2);
		personelList.add(personel3);
		personelList.add(personel4);
		personelList.add(personel5);
		
		System.out.println("EKLENECEK LİSTE");
		System.out.println(personelList);
		
		System.out.println();
		
		System.out.println("EKLEME ÖNCESİ BÜTÜN KAYITLAR");
		System.out.println(dao.butunKayitlariAra());
		
		System.out.println();
		
		// LİSTEDEKİ KAYITLAR TABLOYA GİRİYOR
		dao.topluVeriGirisiBatch1(personelList);
		
		System.out.println("TOPLU VERİ GİRİŞİ VE BÜTÜN KAYITLAR");
		System.out.println(dao.butunKayitlariAra());
		
		System.out.println();
		
		// SORGUYA GÖRE YAPILAN GÜNCELLEME İŞLEMİ
		dao.topluVeriGirisiBatch2("UPDATE personel SET adi='Süleyman' WHERE adi='Ahmet Emre'");
		
		System.out.println("GÜNCELLEME İŞLEMİ VE BÜTÜN KAYITLAR");
		System.out.println(dao.butunKayitlariAra());
		
		context.close();
	}
	
}
