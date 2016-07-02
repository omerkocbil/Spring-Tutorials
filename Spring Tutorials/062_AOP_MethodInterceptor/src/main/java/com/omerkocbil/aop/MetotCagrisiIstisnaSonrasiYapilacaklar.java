package com.omerkocbil.aop;

import org.springframework.aop.ThrowsAdvice;

public class MetotCagrisiIstisnaSonrasiYapilacaklar implements ThrowsAdvice {
	
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("");
		System.out.println("Spring AOP ile metotlardaki istisnadan sonra devreye giren afterThrowing() methodu");
		System.out.println("");
	}
	
}
