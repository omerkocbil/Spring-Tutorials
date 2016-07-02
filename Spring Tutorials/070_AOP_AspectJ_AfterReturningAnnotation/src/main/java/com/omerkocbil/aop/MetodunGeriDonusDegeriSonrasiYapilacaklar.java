package com.omerkocbil.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MetodunGeriDonusDegeriSonrasiYapilacaklar {

	@AfterReturning(pointcut = "execution(* com.omerkocbil.IPersonelServis.selamVer(..))", returning = "sonuc")
	public void geriDonusSonrasiGorev(JoinPoint joinPoint, Object sonuc){
		System.out.println("");
		System.out.println("### AspectJ ### " + joinPoint.getSignature().getName() + " isimli metodun "
				+ "geri dönüş değerinden sonra çalışan geriDonusSonrasiGorev(JointPoint, Object) metodu");
		
		System.out.println("### AspectJ ### " + joinPoint.getSignature().getName() + " isimli metodun "
				+ "geri dönüş değeri : " + sonuc);
		System.out.println("");
	}

}
