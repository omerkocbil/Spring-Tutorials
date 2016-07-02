package com.omerkocbil;

import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.List;

public class Sehir {
	
	private Map<?, ?> mapimiz;

	public Map<?, ?> getMapimiz() {
		return mapimiz;
	}

	public void setMapimiz(Map<?, ?> mapimiz) {
		this.mapimiz = mapimiz;
	}
	
	@Override
	public String toString(){
		return "ŞEHİRLER : " + mapimiz;
	}
	
}
