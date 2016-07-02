package com.omerkocbil;

public class Ucgen {
	
	private String cesit;
	private int yukseklik;
	
	public Ucgen(String cesit){
		this.cesit = cesit;
	}
	
	public Ucgen(int yukseklik){
		this.yukseklik = yukseklik;
	}
	
	public Ucgen(String cesit, int yukseklik){
		this.cesit = cesit;
		this.yukseklik = yukseklik;
	}
	
	public Ucgen(int yukseklik, String cesit){
		this.yukseklik = yukseklik;
		this.cesit = cesit;
	}
	
	public void ciz(){
		System.out.println(yukseklik + " birim yüksekliğinde "+ cesit + " üçgen çiz");
	}
	
}
