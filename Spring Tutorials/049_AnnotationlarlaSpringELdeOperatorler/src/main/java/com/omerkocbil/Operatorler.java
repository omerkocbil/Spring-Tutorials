package com.omerkocbil;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanOperatorler")
public class Operatorler {

	// Relational Operators
	
	@Value("#{beanSayilar.sayi1 == 571}")
	private boolean equalTest;
	
	@Value("#{beanSayilar.sayi2 != beanSayilar.sayi2}")
	private boolean notEqualTest;
	
	@Value("#{beanSayilar.sayi3 lt beanSayilar.sayi1}")
	private boolean lessThanTest;
	
	@Value("#{beanSayilar.sayi4 le beanSayilar.sayi2}")
	private boolean lessThanOrEqualTest;
	
	@Value("#{beanSayilar.sayi5 > beanSayilar.sayi5}")
	private boolean greaterThanTest;
	
	@Value("#{beanSayilar.sayi1 >= beanSayilar.sayi3}")
	private boolean greaterThanOrEqualTest;

	// Logical Operators
	
	@Value("#{beanSayilar.sayi2 == 571 and beanSayilar.sayi2 lt 571}")
	private boolean andTest;
	
	@Value("#{beanSayilar.sayi3 == 1299 or beanSayilar.sayi4 lt 1071}")
	private boolean orTest;
	
	@Value("#{!(beanSayilar.sayi4 == 632)}")
	private boolean notTest;

	// Mathematical Operators
	
	@Value("#{beanSayilar.sayi5 + beanSayilar.sayi2}")
	private double addTest;
	
	@Value("#{'Merhaba' + '@' + 'SpringEL'}")
	private String addStringTest;
	
	@Value("#{beanSayilar.sayi1 - beanSayilar.sayi3}")
	private double subtractionTest;
	
	@Value("#{beanSayilar.sayi2 * beanSayilar.sayi4}")
	private double multiplicationTest;
	
	@Value("#{beanSayilar.sayi3 / beanSayilar.sayi2}")
	private double divisionTest;
	
	@Value("#{beanSayilar.sayi4 % beanSayilar.sayi1}")
	private double modulusTest;
	
	@Value("#{beanSayilar.sayi5 ^ 2}")
	private double exponentialPowerTest;

	public boolean isEqualTest() {
		return equalTest;
	}

	public void setEqualTest(boolean equalTest) {
		this.equalTest = equalTest;
	}

	public boolean isNotEqualTest() {
		return notEqualTest;
	}

	public void setNotEqualTest(boolean notEqualTest) {
		this.notEqualTest = notEqualTest;
	}

	public boolean isLessThanTest() {
		return lessThanTest;
	}

	public void setLessThanTest(boolean lessThanTest) {
		this.lessThanTest = lessThanTest;
	}

	public boolean isLessThanOrEqualTest() {
		return lessThanOrEqualTest;
	}

	public void setLessThanOrEqualTest(boolean lessThanOrEqualTest) {
		this.lessThanOrEqualTest = lessThanOrEqualTest;
	}

	public boolean isGreaterThanTest() {
		return greaterThanTest;
	}

	public void setGreaterThanTest(boolean greaterThanTest) {
		this.greaterThanTest = greaterThanTest;
	}

	public boolean isGreaterThanOrEqualTest() {
		return greaterThanOrEqualTest;
	}

	public void setGreaterThanOrEqualTest(boolean greaterThanOrEqualTest) {
		this.greaterThanOrEqualTest = greaterThanOrEqualTest;
	}

	public boolean isAndTest() {
		return andTest;
	}

	public void setAndTest(boolean andTest) {
		this.andTest = andTest;
	}

	public boolean isOrTest() {
		return orTest;
	}

	public void setOrTest(boolean orTest) {
		this.orTest = orTest;
	}

	public boolean isNotTest() {
		return notTest;
	}

	public void setNotTest(boolean notTest) {
		this.notTest = notTest;
	}

	public double getAddTest() {
		return addTest;
	}

	public void setAddTest(double addTest) {
		this.addTest = addTest;
	}

	public String getAddStringTest() {
		return addStringTest;
	}

	public void setAddStringTest(String addStringTest) {
		this.addStringTest = addStringTest;
	}

	public double getSubtractionTest() {
		return subtractionTest;
	}

	public void setSubtractionTest(double subtractionTest) {
		this.subtractionTest = subtractionTest;
	}

	public double getMultiplicationTest() {
		return multiplicationTest;
	}

	public void setMultiplicationTest(double multiplicationTest) {
		this.multiplicationTest = multiplicationTest;
	}

	public double getDivisionTest() {
		return divisionTest;
	}

	public void setDivisionTest(double divisionTest) {
		this.divisionTest = divisionTest;
	}

	public double getModulusTest() {
		return modulusTest;
	}

	public void setModulusTest(double modulusTest) {
		this.modulusTest = modulusTest;
	}

	public double getExponentialPowerTest() {
		return exponentialPowerTest;
	}

	public void setExponentialPowerTest(double exponentialPowerTest) {
		this.exponentialPowerTest = exponentialPowerTest;
	}

}
