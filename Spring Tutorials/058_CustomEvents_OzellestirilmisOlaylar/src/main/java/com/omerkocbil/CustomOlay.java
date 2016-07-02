package com.omerkocbil;

import org.springframework.context.ApplicationEvent;

public class CustomOlay extends ApplicationEvent {

	private static final long serialVersionUID = 1L;	
	
	public CustomOlay(Object source) {
		super(source);
	}

	@Override
	public String toString(){
		return "Özelleştirilmiş Olay";
	}
	 
}
