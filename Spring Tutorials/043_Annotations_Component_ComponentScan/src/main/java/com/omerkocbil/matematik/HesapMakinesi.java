package com.omerkocbil.matematik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Sınıfın üzerinde aşağıdaki annotation kullanılırsa spring onu direk bean olarak oluşturur
@Component("beanHesapMakinesi")
public class HesapMakinesi {
	
	@Autowired
	Islem islem;
	
	public void setIslem(Islem islem){
		this.islem = islem;
	}
	
	public void sonuclariGetir(int sayi1, int sayi2){
		System.out.println("TOPLAMA : " + islem.topla(sayi1, sayi2));
		System.out.println("ÇIKARMA : " + islem.cikar(sayi1, sayi2));
		System.out.println("ÇARPMA : " + islem.carp(sayi1, sayi2));
		System.out.println("BÖLME : " + islem.bol(sayi1, sayi2));
	}
	
}
