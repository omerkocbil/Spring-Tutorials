package com.omerkocbil.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MetotCagrisiSonrasiYapilacaklar implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("");
		System.out.println("Spring AOP ile her metodun dönüş değerinden sonra devreye giren afterReturning(Object, Method, Object[], Object) methodu");
		System.out.println("");
	}

}
