package com.omerkocbil;

public class Araba {
	
	private Yakit yakit;
	
	public Araba(Yakit yakit){
		this.yakit = yakit;
	}
	
	void hareketeGec(){
		yakit.depo();
		System.out.println("Araba harekete geçti");
	}
	
}
