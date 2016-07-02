package com.omerkocbil.matematik;

import org.springframework.stereotype.Component;

// Sınıfın üzerinde aşağıdaki annotation kullanılırsa spring onu direk bean olarak oluşturur
@Component("beanIslem")
public class Islem {
	
	public int topla(int sayi1, int sayi2){
		return sayi1 + sayi2;
	}
	
	public int cikar(int sayi1, int sayi2){
		return sayi1 - sayi2;
	}
	
	public int carp(int sayi1, int sayi2){
		return sayi1 * sayi2;
	}
	
	public double bol(int sayi1, int sayi2){
		return (double) sayi1 / sayi2;
	}
	

}
