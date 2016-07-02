package com.omerkocbil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Personel personel = context.getBean(Personel.class);
		
		System.out.println("ADI         : " + personel.getAdi());
		System.out.println("SOYADI      : " + personel.getSoyadi());
		System.out.println("GÖREVİ      : " + personel.getGorevi());
		System.out.println("DOĞUM YILI  : " + personel.getDogumYili());
		System.out.println("MAAŞI       : " + personel.getMaasi());
		System.out.println("EHLİYET     : " + personel.isEhliyet());
		System.out.println("MEDENİ HALİ : " + personel.isMedeniHali());
		System.out.println("ANNE ADI    : " + personel.getAnneAdi());
		System.out.println("BABA ADI    : " + personel.getBabaAdi());
		System.out.println("TELEFON NO  : " + personel.getTelNo());
		System.out.println("ADRES       : " + personel.getAdres());
		
		//işimiz bitince context i kapatma kodu
		((ConfigurableApplicationContext)context).close();
		
	}
	
}
