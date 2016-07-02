package com.omerkocbil;

public class Listeler {

	private String mapElemani;
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
