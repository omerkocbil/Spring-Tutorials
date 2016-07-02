package com.omerkocbil;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class ContextOlayDurdurmaIsleyicisi implements ApplicationListener<ContextStoppedEvent> {

	@Override
	public void onApplicationEvent(ContextStoppedEvent arg0) {
		
		System.out.println("Context Olay Durdurma");
		
	}

}
