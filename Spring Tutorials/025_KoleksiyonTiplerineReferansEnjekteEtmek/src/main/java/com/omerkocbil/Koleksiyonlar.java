package com.omerkocbil;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Koleksiyonlar {
	
	List <Object> ogrenciList;
	Set <Object> ogrenciSet;
	Map <Object, Object> ogrenciMap;
	Properties ogrenciProp;
	
	public List<Object> getOgrenciList() {
		return ogrenciList;
	}
	
	public void setOgrenciList(List<Object> ogrenciList) {
		this.ogrenciList = ogrenciList;
	}
	
	public Set<Object> getOgrenciSet() {
		return ogrenciSet;
	}
	
	public void setOgrenciSet(Set<Object> ogrenciSet) {
		this.ogrenciSet = ogrenciSet;
	}
	
	public Map<Object, Object> getOgrenciMap() {
		return ogrenciMap;
	}
	
	public void setOgrenciMap(Map<Object, Object> ogrenciMap) {
		this.ogrenciMap = ogrenciMap;
	}
	
	public Properties getOgrenciProp() {
		return ogrenciProp;
	}
	
	public void setOgrenciProp(Properties ogrenciProp) {
		this.ogrenciProp = ogrenciProp;
	}
	
	@Override
	public String toString(){
		return "List = " + ogrenciList + "\n" +
			   "Set = " + ogrenciSet + "\n" +
			   "Map = " + ogrenciMap + "\n" +
			   "Property = " + ogrenciProp;
	}
	
}
