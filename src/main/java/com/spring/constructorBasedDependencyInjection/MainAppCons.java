package com.spring.constructorBasedDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainAppCons {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beanConstructorBasedDI.xml");

		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellChecker();
	}

}

