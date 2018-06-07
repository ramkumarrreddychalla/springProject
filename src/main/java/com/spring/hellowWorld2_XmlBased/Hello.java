package com.spring.hellowWorld2_XmlBased;

public class Hello {
	
	private String name;
	

	public Hello() {
		System.out.println("Test Constuctor");
	}
	
	public void hello() {
		System.out.println("HelloWorld Yadhu!");
	}
	
	
	//getters and setters
	public String getName() {
		System.out.println("I am "+name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public void init(){
		System.out.println("Bean is going through init.");
	}
	public void destroyer() {
		System.out.println("Bean will destroy now.");
	}
}
