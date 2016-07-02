package com.omerkocbil;

public class B {
	
	private A aNesnesi;
	
	public B(A aNesnesi){
		System.out.println("B sınıfının hazırlayıcı metodu");
		this.aNesnesi = aNesnesi;
	}

	public void sonucuGoster(){
		System.out.println("B sınıfına ait normal bir metod");
		aNesnesi.konsolaYaz();
	}
	
}
