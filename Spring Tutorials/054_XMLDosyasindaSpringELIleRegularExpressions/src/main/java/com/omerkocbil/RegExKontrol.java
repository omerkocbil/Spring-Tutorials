package com.omerkocbil;

public class RegExKontrol {

	private String regEx;
	private String regExSonuc;

	public String getRegEx() {
		return regEx;
	}

	public void setRegEx(String regEx) {
		this.regEx = regEx;
	}

	public String getRegExSonuc() {
		return regExSonuc;
	}

	public void setRegExSonuc(String regExSonuc) {
		this.regExSonuc = regExSonuc;
	}

	@Override
	public String toString(){
		return "\n" + "Girdiğiniz e-posta adresi " + getRegExSonuc();
	}
	
}
