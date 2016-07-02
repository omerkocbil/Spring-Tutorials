package com.omerkocbil;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Takip {
	
	private String mesaj;
	
	public String getMesaj() {
		System.out.println(mesaj);
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}

	@PostConstruct
	public void init(){
		System.out.println("Para çekmek için 'Giriş' e basınız.");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("Para çekildi");
	}
	
}
