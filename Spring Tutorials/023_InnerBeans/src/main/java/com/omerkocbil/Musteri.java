package com.omerkocbil;

public class Musteri {
	
	Siparis siparis;
	
	public Musteri(){
		System.out.println("Müşteri sınıfının yapılandırıcısı");
	}

	public Siparis getSiparis() {
		return siparis;
	}

	public void setSiparis(Siparis siparis) {
		this.siparis = siparis;
	}
		
	public void hesabiOde(){
		System.out.println("Müşteri sınıfındaki hesabiOde metodu");
		siparis.toplamSonucuAl();
	}
	
}
