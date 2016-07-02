package com.omerkocbil;

import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.List;

public class Ayar {
	
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	@Override
	public String toString(){
		return "SONUÇ : " + properties;
	}
	
	public void sonucuYaz(){
		System.out.println(properties.toString());
	}
	
}
