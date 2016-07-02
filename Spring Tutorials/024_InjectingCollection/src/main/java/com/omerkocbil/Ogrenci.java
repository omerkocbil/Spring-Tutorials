package com.omerkocbil;

import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.List;

public class Ogrenci {
	
	List <?> ogrenciList;
	Set <?> ogrenciSet;
	Map <?, ?> ogrenciMap;
	Properties ogrenciProp;
	
	public List<?> getOgrenciList() {
		System.out.println("List elemanları : " + ogrenciList);
		return ogrenciList;
	}
	
	public void setOgrenciList(List<?> ogrenciList) {
		this.ogrenciList = ogrenciList;
	}
	
	public Set<?> getOgrenciSet() {
		System.out.println("Set elemanları : " + ogrenciSet);
		return ogrenciSet;
	}
	
	public void setOgrenciSet(Set<?> ogrenciSet) {
		this.ogrenciSet = ogrenciSet;
	}
	
	public Map<?, ?> getOgrenciMap() {
		System.out.println("Map elemanları : " + ogrenciMap);
		return ogrenciMap;
	}
	
	public void setOgrenciMap(Map<?, ?> ogrenciMap) {
		this.ogrenciMap = ogrenciMap;
	}
	
	public Properties getOgrenciProp() {
		System.out.println("Property elemanları : " + ogrenciProp);
		return ogrenciProp;
	}
	
	public void setOgrenciProp(Properties ogrenciProp) {
		this.ogrenciProp = ogrenciProp;
	}
	
}
