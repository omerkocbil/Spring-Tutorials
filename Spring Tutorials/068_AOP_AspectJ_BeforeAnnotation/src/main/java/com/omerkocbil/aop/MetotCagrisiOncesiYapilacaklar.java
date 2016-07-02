package com.omerkocbil.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MetotCagrisiOncesiYapilacaklar {

	@Before("execution(* com.omerkocbil.IPersonelServis.selamVer(..))")
	public void ilkGorev(JoinPoint joinPoint){
		System.out.println("");
		System.out.println("### AspectJ ### " + joinPoint.getSignature().getName() + " isimli metottan "
				+ "önce çalışan ilkGorev(JointPoint) metodu");
		System.out.println("");
	}

}
