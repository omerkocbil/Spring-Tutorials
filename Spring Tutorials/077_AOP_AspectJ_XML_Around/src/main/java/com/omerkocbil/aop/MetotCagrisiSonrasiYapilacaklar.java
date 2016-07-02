package com.omerkocbil.aop;


import org.aspectj.lang.JoinPoint;

public class MetotCagrisiSonrasiYapilacaklar {

	public void sonGorev(JoinPoint joinPoint){
		System.out.println("");
		System.out.println("### AspectJ XML Etiketi ### " + joinPoint.getSignature().getName() + " isimli metottan "
				+ "sonra çalışan sonGorev(JointPoint) metodu");
		System.out.println("");
	}

}
