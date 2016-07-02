package com.omerkocbil.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MetotCagrisiIstisnaSonrasiYapilacaklar {

	@AfterThrowing(pointcut = "execution(* com.omerkocbil.IPersonelServis.adiSoyadiKontrolEt(..))", throwing = "hata")
	public void istisnaSonrasiGorev(JoinPoint joinPoint, Throwable hata){
		System.out.println("");
		System.out.println("### AspectJ ### " + joinPoint.getSignature().getName() + " isimli metodun "
				+ "bir istisnadan sonra çalışan istisnaSonrasiGorev(JointPoint, Throwable) metodu");
		
		System.out.println("### AspectJ ### " + joinPoint.getSignature().getName() + " isimli metotta "
				+ "meydana gelen istisna türü : " + hata);
		System.out.println("");
	}

}
