package com.omerkocbil;

import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.List;

public class Personel {
	
	private List<?> listemiz;

	public List<?> getListemiz() {
		return listemiz;
	}

	public void setListemiz(List<?> listemiz) {
		this.listemiz = listemiz;
	}
	
	@Override
	public String toString(){
		return "PERSONELLER : " + listemiz;
	}
	
}
