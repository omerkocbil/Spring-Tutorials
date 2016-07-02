package com.omerkocbil.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CagrilanMetodunOncesiVeSonrasiOzellikleri implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		// Aynı before metodu gibi çalışır
		System.out.println("");
		System.out.println("****Çağrılan metodun önceki durumu");

		System.out.println("Çağrılan metodun adı : " + methodInvocation.getMethod().getName());
		System.out.println("Çağrılan metodun argumentleri : " + methodInvocation.getArguments());

		try {
			Object result = methodInvocation.proceed();
			// Aynı afterReturning metodu gibi çalışır
			System.out.println("****Çağrılan metodun sonraki durumu");
			return result;
		} catch (IllegalArgumentException e) {
			System.out.println("****Çağrılan metoda istisna gelme durumu");
			throw e;
		} finally {
			System.out.println("");
		}
	}

}
