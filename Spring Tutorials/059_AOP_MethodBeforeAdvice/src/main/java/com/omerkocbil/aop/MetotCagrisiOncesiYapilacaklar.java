package com.omerkocbil.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MetotCagrisiOncesiYapilacaklar implements MethodBeforeAdvice {

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("");
		System.out.println("Spring AOP ile her metottan önce devreye giren before(Method, Object[], Object) methodu");
		System.out.println("");
	}

}
