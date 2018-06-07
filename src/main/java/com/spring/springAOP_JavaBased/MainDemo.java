package com.spring.springAOP_JavaBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {

	
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppJavaBasedConfig.class);
		Alien alien = context.getBean(Alien.class);
		alien.setMyName("Yadhu");
		alien.show();
		
		/*ApplicationContext context = new ClassPathXmlApplicationContext("beanaAfterReturningAOP.xml");
		Alien alien = (Alien) context.getBean("ref_myName");
		alien.show();*/		 
	}

}
