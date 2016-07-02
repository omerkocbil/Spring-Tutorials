package com.omerkocbil.aop;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class CagirilanMetodunOncesiVeSonrasiOzellikleri {
	
	@Around("execution(* com.omerkocbil.IPersonelServis.adiSoyadiKontrolEt(..))")
	public void secilenMetoduSar(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("");
		System.out.println("### AspectJ ### " + joinPoint.getSignature().getName() + " isimli metottan "
				+ "önce çalışan secilenMetoduSar(JointPoint) metodu");
		
		System.out.println("### AspectJ ### " + "Çağırılan metodun  argumentleri : "
				+ Arrays.toString(joinPoint.getArgs()));
		
		joinPoint.proceed();
		
		System.out.println("### AspectJ ### " + joinPoint.getSignature().getName() + " isimli metottan " 
				+ "sonra çalışan secilenMetoduSar(JointPoint) metodu");
		System.out.println("");
	}
	
}
