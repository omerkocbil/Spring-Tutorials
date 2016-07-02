package com.omerkocbil;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanRegExKontrol")
public class RegExKontrol {
	
	//@Value("^[_A-Za-z0-9-\+]+(\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\.[A-Za-z0-9]+)*(\.[A-Za-z]{2,})$")
	private String regEx;
	
	//@Value("#{(beanKaynak.map['Cem Dırman'] matches '^[_A-Za-z0-9-\+]+(\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\.[A-Za-z0-9]+)*(\.[A-Za-z]{2,})$') == true ? 'UYGUN' : 'UYGUN DEĞİL' }")
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
