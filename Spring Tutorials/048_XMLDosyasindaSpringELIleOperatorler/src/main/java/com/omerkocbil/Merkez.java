package com.omerkocbil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Operatorler operatorler = context.getBean("beanOperatorler" ,Operatorler.class);
		
		System.out.println(operatorler.isEqualTest());
		System.out.println(operatorler.isNotEqualTest());
		System.out.println(operatorler.isLessThanTest());
		System.out.println(operatorler.isLessThanOrEqualTest());
		System.out.println(operatorler.isGreaterThanTest());
		System.out.println(operatorler.isGreaterThanOrEqualTest());
		System.out.println(operatorler.isAndTest());
		System.out.println(operatorler.isOrTest());
		System.out.println(operatorler.isNotTest());
		System.out.println(operatorler.getAddTest());
		System.out.println(operatorler.getAddStringTest());
		System.out.println(operatorler.getSubtractionTest());
		System.out.println(operatorler.getMultiplicationTest());
		System.out.println(operatorler.getDivisionTest());
		System.out.println(operatorler.getModulusTest());
		System.out.println(operatorler.getExponentialPowerTest());
		
		((ConfigurableApplicationContext)context).close();
		
	}
	
}
