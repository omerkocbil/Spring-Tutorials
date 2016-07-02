package com.omerkocbil;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class ContextOlayBaslatmaIsleyicisi implements ApplicationListener<ContextStartedEvent> {

	@Override
	public void onApplicationEvent(ContextStartedEvent arg0) {
		
		System.out.println("Context Olay Başlatma");
		
	}
	
}
