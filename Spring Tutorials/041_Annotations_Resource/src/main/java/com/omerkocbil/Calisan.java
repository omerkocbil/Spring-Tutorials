package com.omerkocbil;

import javax.annotation.Resource;

public class Calisan {

	// Alttaki annotation ile sehir değişkeninin kaynağının ayar dosyasındaki beanSehir olduğunu söylüyoruz.
	@Resource(name="beanSehir")
	private Sehir sehir;

	public Sehir getSehir() {
		return sehir;
	}

	public void setSehir(Sehir sehir) {
		this.sehir = sehir;
	}
	
}
