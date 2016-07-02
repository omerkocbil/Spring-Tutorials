package com.omerkocbil.aop;


import org.aspectj.lang.JoinPoint;

public class MetotCagrisiIstisnaSonrasiYapilacaklar {

	public void istisnaSonrasiGorev(JoinPoint joinPoint, Throwable hata){
		System.out.println("");
		System.out.println("### AspectJ XML Etiketi ### " + joinPoint.getSignature().getName() + " isimli metodun "
				+ "bir istisnadan sonra çalışan istisnaSonrasiGorev(JointPoint, Throwable) metodu");
		
		System.out.println("### AspectJ XML Etiketi ### " + joinPoint.getSignature().getName() + " isimli metotta "
				+ "meydana gelen istisna türü : " + hata);
		System.out.println("");
	}

}
