package com.omerkocbil.aop;


import org.aspectj.lang.JoinPoint;


public class MetotCagrisiOncesiYapilacaklar {

	public void ilkGorev(JoinPoint joinPoint){
		System.out.println("");
		System.out.println("### AspectJ XML Etiketi ### " + joinPoint.getSignature().getName() + " isimli metottan "
				+ "önce çalışan ilkGorev(JointPoint) metodu");
		System.out.println("");
	}

}
