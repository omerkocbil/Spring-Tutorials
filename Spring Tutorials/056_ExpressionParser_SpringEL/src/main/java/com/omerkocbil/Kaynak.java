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
	private String eposta;

	public Kaynak(){
		eposta = "omer-95@hotmail.com";
		
		map = new HashMap<String, String>();
		map.put("Cem Dırman", "ccc.3@gmail.com");
		map.put("Ahmet Emre Demirşen", "aaaaa.5@gmail.com");
		map.put("Ömer Yazıcı", "oooo_4@hotmail.com");
		
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

	public String getEposta() {
		return eposta;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}
	
}
