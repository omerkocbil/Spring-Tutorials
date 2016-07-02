package com.omerkocbil;

import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.List;

public class Personel {
	
	private Set<?> setimiz;

	public Set<?> getSetimiz() {
		return setimiz;
	}

	public void setSetimiz(Set<?> setimiz) {
		this.setimiz = setimiz;
	}
	
	@Override
	public String toString(){
		return "PERSONELLER : " + setimiz;
	}
	
}
