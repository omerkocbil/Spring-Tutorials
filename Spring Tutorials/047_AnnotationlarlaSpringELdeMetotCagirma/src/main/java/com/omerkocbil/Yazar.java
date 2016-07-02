package com.omerkocbil;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanYazar")
public class Yazar {

	@Value("Ömer")
	private String adi; 
	
	@Value("Koçbil")
	private String soyadi; 
	
	@Value("#{beanKitap.eserAdi}")
	private String kitapAdi;
	
	@Value("#{beanKitap}")
	private Kitap kitap;
	
	@Value("#{beanKitap.kitapBilgisiniAl('Ömer', 'Koçbil', 'Hacı', 1119766587)}")
	private String bilgi;

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

	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

	public Kitap getKitap() {
		return kitap;
	}

	public void setKitap(Kitap kitap) {
		this.kitap = kitap;
	}

	public String getBilgi() {
		return bilgi;
	}

	public void setBilgi(String bilgi) {
		this.bilgi = bilgi;
	}
	
}
