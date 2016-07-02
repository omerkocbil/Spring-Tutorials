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
		
		Personel personel = new Personel("Ömer","Koçbil",30);
		
		System.out.println("CREATE / OLUŞTUR");
		dao.createOlustur1(personel);
		
		System.out.println();
		
		System.out.println("READ / OKU");
		dao.readOku1(4);
		
		System.out.println();
		
		System.out.println("UPDATE / GÜNCELLE");
		personel.setAdi("Stephen");
		personel.setSoyadi("Curry");
		personel.setTecrube(30);
		dao.updateGuncelle1(personel, 3);
		
		System.out.println();
		
		System.out.println("GÜNCELLEME SONRASI TÜM KAYITLAR");
		List<Personel> personelList = dao.getAllHepsiniGetir1();
		System.out.println(personelList);
		
		System.out.println();
		
		System.out.println("DELETE / SİL");
		dao.deleteSil1(2);
		dao.deleteSil1(6);
		dao.deleteSil1(9);
		
		System.out.println();
		
		System.out.println("SİLME SONRASI TÜM KAYITLAR");
		System.out.println(dao.getAllHepsiniGetir1());
		
		System.out.println("-----------------");
		System.out.println("-----------------");
		
		Personel personel2 = new Personel("Kobe","Bryant",24);
		
		System.out.println("CREATE / OLUŞTUR");
		dao.createOlustur2(personel2);
		
		System.out.println();
		
		System.out.println("READ / OKU");
		dao.readOku2(16);
		
		System.out.println();
		
		System.out.println("UPDATE / GÜNCELLE");
		personel2.setAdi("Paul");
		personel2.setSoyadi("George");
		personel2.setTecrube(13);
		dao.updateGuncelle2(personel2, 5);
		
		System.out.println();
		
		System.out.println("GÜNCELLEME SONRASI TÜM KAYITLAR");
		List<Personel> personelList2 = dao.getAllHepsiniGetir2();
		System.out.println(personelList2);
		
		System.out.println();
		
		System.out.println("DELETE / SİL");
		dao.deleteSil2(1);
		dao.deleteSil2(7);
		dao.deleteSil2(5);
		
		System.out.println();
		
		System.out.println("SİLME SONRASI TÜM KAYITLAR");
		System.out.println(dao.getAllHepsiniGetir2());
		
		context.close();
	}
	
}
