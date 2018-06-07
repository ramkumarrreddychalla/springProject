package com.spring.springAOP_JavaBased;

public class NewAlien {
	private String myName;

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}
	
	public void show() {
		System.out.println("Hey "+myName);
	}
}
