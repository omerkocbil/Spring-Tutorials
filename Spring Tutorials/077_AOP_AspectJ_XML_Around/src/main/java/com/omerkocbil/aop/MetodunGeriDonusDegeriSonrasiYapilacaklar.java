package com.omerkocbil.aop;


import org.aspectj.lang.JoinPoint;

public class MetodunGeriDonusDegeriSonrasiYapilacaklar {

	public void geriDonusSonrasiGorev(JoinPoint joinPoint, Object sonuc){
		System.out.println("");
		System.out.println("### AspectJ XML Etiketi ### " + joinPoint.getSignature().getName() + " isimli metodun "
				+ "geri dönüş değerinden sonra çalışan geriDonusSonrasiGorev(JointPoint, Object) metodu");
		
		System.out.println("### AspectJ XML Etiketi ### " + joinPoint.getSignature().getName() + " isimli metodun "
				+ "geri dönüş değeri : " + sonuc);
		System.out.println("");
	}

}
