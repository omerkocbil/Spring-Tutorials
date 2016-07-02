package com.omerkocbil;

public class Ogrenci {
	
	private String adi, soyadi;
	private int numarasi;
	private Okul universite;
	
	public Okul getUniversite() {
		return universite;
	}

	public void setUniversite(Okul universite) {
		this.universite = universite;
	}

	public String getAdi() {
		return adi;
	}
	
	public void setAdi(String adi) {
		this.adi = adi;
	}
	
	public String getSoyadi() {
		return soyadi;
	}
	
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	
	public int getNumarasi() {
		return numarasi;
	}
	
	public void setNumarasi(int numarasi) {
		this.numarasi = numarasi;
	}
	
	
	
}
