package com.omerkocbil;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitMerhaba implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("Başlatma Sonrası " + arg1);
		return arg0;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1)	throws BeansException {
		System.out.println("Başlatma Öncesi " + arg1);
		return arg0;
	}
	
}
