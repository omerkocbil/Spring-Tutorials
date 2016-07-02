package com.omerkocbil;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanListeler")
public class Listeler {

	@Value("#{beanKaynak.map['Cem Dırman']}")
	private String mapElemani;
	
	@Value("#{beanKaynak.list[2]}")
	private String listElemani;

	public String getMapElemani() {
		return mapElemani;
	}

	public void setMapElemani(String mapElemani) {
		this.mapElemani = mapElemani;
	}

	public String getListElemani() {
		return listElemani;
	}

	public void setListElemani(String listElemani) {
		this.listElemani = listElemani;
	}
	
	public String toString(){
		return "Seçilen Map Elemanı : " + getMapElemani() + "\n" +
			   "Seçilen List Elemanı : " + getListElemani();
	}
	
}
