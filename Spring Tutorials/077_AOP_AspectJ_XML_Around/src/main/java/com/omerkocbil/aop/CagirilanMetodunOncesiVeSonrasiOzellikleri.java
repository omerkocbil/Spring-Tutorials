package com.omerkocbil.aop;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

public class CagirilanMetodunOncesiVeSonrasiOzellikleri {
	
	public void secilenMetoduSar(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("");
		System.out.println("### AspectJ XML Etiketi ### " + joinPoint.getSignature().getName() + " isimli metottan "
				+ "önce çalışan secilenMetoduSar(JointPoint) metodu");
		
		System.out.println("### AspectJ XML Etiketi ### " + "Çağırılan metodun  argumentleri : "
				+ Arrays.toString(joinPoint.getArgs()));
		
		joinPoint.proceed();
		
		System.out.println("### AspectJ XML Etiketi ### " + joinPoint.getSignature().getName() + " isimli metottan " 
				+ "sonra çalışan secilenMetoduSar(JointPoint) metodu");
		System.out.println("");
	}
	
}
