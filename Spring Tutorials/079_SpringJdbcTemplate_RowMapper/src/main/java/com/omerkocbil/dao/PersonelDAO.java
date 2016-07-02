package com.omerkocbil.dao;

import java.util.List;

import com.omerkocbil.enterprise.Personel;

public interface PersonelDAO {
	
	public void ekle(Personel personel);
	
	public Personel idAra(int id);
	
	public Personel adiAra(String adi);
	
	public Personel tecrubeAra(int tecrube);
	
	public List<Personel> butunKayitlariAra();
	
	public String idDegeriyleStringBirVeriyiCekme(int id);
	
}
