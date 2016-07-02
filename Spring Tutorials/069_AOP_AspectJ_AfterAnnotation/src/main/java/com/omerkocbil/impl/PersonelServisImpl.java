package com.omerkocbil.impl;

import com.omerkocbil.IPersonelServis;

public class PersonelServisImpl implements IPersonelServis {
	
	private String adi, soyadi;
	private int tecrube;

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

	public int getTecrube() {
		return tecrube;
	}

	public void setTecrube(int tecrube) {
		this.tecrube = tecrube;
	}
	
	@Override
	public void adiSoyadiKontrolEt(){
		System.out.println("");
		System.out.println("----PersonelServis in adiSoyadiKontrolEt() metodu");
		if(adi.length() < 2 || soyadi.length() < 2){
			throw new IllegalArgumentException();
		}
		System.out.println("");
	}
	
	@Override
	public void selamVer(String mesaj){
		System.out.println("");
		System.out.println("----PersonelServis in selamVer(String) metodu");
		System.out.println("Gelen mesaj : " + mesaj);
		System.out.println("");
	}
	
	@Override
	public void personelBilgisiniVer(){
		System.out.println("");
		System.out.println("----PersonelServis in personelBilgisiniVer() metodu");
		System.out.println("Adı Soyadı : " + adi + " " + soyadi);
		System.out.println("Tecrübe : " + tecrube + " " + "yıl");
		System.out.println("");
	}
	
}
