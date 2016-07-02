package com.omerkocbil;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeansConfig {
	
	@Bean
	public Sehir beanSehir(){
		Sehir sehir = new Sehir();
		sehir.setSehirAdi("Aydın");
		sehir.setPlakaNo(9);
		return sehir;
	}
	
	@Bean
	public Ogrenci beanOgrenci(){
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setAdi("Ömer");
		ogrenci.setSoyadi("Koçbil");
		ogrenci.setSehir(beanSehir());
		return ogrenci;
	}
	
}
