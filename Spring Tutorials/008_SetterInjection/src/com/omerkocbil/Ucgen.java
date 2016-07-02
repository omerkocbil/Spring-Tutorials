package com.omerkocbil;

public class Ucgen {
	
	private String cesit;
	
	public String getCesit() {
		return cesit;
	}

	public void setCesit(String cesit) {
		this.cesit = cesit;
	}
	
	public void ciz(){
		System.out.println(getCesit() + " üçgen çiz");
	}
	
}
