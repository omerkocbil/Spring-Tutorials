package com.omerkocbil.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MetotCagrisiSonrasiYapilacaklar {

	@After("execution(* com.omerkocbil.IPersonelServis.selamVer(..))")
	public void sonGorev(JoinPoint joinPoint){
		System.out.println("");
		System.out.println("### AspectJ ### " + joinPoint.getSignature().getName() + " isimli metottan "
				+ "sonra çalışan sonGorev(JointPoint) metodu");
		System.out.println("");
	}

}
