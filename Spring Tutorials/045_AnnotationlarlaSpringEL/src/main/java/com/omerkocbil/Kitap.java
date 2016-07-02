package com.omerkocbil;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanKitap")
public class Kitap {
	
	@Value("1749386143")
	private long eserISBN;
	
	@Value("Hacı N'aptın")
	private String eserAdi;

	public long getEserISBN() {
		return eserISBN;
	}

	public void setEserISBN(long eserISBN) {
		this.eserISBN = eserISBN;
	}

	public String getEserAdi() {
		return eserAdi;
	}

	public void setEserAdi(String eserAdi) {
		this.eserAdi = eserAdi;
	}

}
