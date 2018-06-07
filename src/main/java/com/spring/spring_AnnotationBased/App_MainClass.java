package com.spring.spring_AnnotationBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App_MainClass {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		 ApplicationContext factory = new AnnotationConfigApplicationContext(App_Config.class);
		
		Samsung sung = (Samsung) factory.getBean(Samsung.class);
		sung.config();
	}
}
