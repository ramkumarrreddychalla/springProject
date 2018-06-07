package com.spring.hellowWorld2_XmlBased;

public class ConstructorInjectionClass {
	private String place;
	
	public ConstructorInjectionClass(String place) {//constructor Injection
		super();
		this.place = place;
	}

	
public void print() { 
	// TODO Auto-generated constructor stub
	System.out.println("I live in "+place);
}

}
