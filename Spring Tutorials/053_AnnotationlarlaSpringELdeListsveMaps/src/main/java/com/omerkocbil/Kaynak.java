package com.omerkocbil;

import java.util.Map;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component("beanKaynak")
public class Kaynak {

	private Map<String, String> map;
	private List<String> list;

	public Kaynak(){
		map = new HashMap<String, String>();
		map.put("Hibernate", "Cem Dırman");
		map.put("Spring", "Ömer Koçbil");
		map.put("Primefaces", "Ahmet Emre Demirşen");
		
		list = new ArrayList<String>();
		list.add("Kadir İmer");
		list.add("Burak Akın");
		list.add("Ai Baturay Kalkavan");
	}
	
	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

}
