package com.omerkocbil.dao;

import java.util.List;

import com.omerkocbil.enterprise.Personel;

public interface PersonelDAO {
	
	// Create - Olustur - Kaydet - Ekle
	public void createOlustur1(Personel personel);
	public void createOlustur2(Personel personel);
	
	// Read - Oku
	public Personel readOku1(int id);
	public Personel readOku2(int id);
	
	// Update - Güncelle - Düzenle
	public void updateGuncelle1(Personel personel, int id);
	public void updateGuncelle2(Personel personel, int id);
	
	// Delete - Sil
	public void deleteSil1(int id);
	public void deleteSil2(int id);

	// Get All - Hepsini Getir
	public List<Personel> getAllHepsiniGetir1();
	public List<Personel> getAllHepsiniGetir2();
	
}
