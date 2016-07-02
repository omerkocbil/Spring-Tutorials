package com.omerkocbil;

public class Yazar {

	private String adi, soyadi, kitapAdi;
	private Kitap kitap;
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
