package com.omerkocbil;

public class Sozler {

	private String cumle;

	public String getCumle() {
		return cumle;
	}

	public void setCumle(String cumle) {
		this.cumle = cumle;
	}
	
	public void ekranaYaz(){
		System.out.println(getCumle());
		System.out.println("Ömer K.");
	}
	
}
