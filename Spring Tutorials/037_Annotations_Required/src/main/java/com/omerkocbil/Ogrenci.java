package com.omerkocbil;

import org.springframework.beans.factory.annotation.Required;

public class Ogrenci {
	
	private Integer yasi;
	private String adi, soyadi;
	
	public Integer getYasi() {
		return yasi;
	}
	
	// Alttaki annotation set metodunun üzerine yazıldığı zaman mutlaka o değişkene ilk değer vermen gerektiğini 
	// belirtir.
	@Required
	public void setYasi(Integer yasi) {
		this.yasi = yasi;
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
	
}
