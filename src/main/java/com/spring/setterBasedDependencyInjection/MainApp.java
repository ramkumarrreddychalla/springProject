package com.spring.setterBasedDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beanSetterBasedDI.xml");

		TextEditor te = (TextEditor) context.getBean("textEditor2");
		te.spellCheck();
	}

}
