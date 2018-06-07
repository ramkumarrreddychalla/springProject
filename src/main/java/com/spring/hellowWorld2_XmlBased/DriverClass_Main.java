package com.spring.hellowWorld2_XmlBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass_Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("springs.xml");
		
		Hello hel = (Hello) context.getBean("ref_hello");
		Hello hel1 = (Hello) context.getBean("ref_hello");
		Hello hel2 = (Hello) context.getBean("ref_hello");
		System.out.println(hel==hel1);
		System.out.println(hel==hel2);
		System.out.println(hel2==hel1);
		hel.hello();
		hel1.hello();
		hel2.hello();
		
		hel.getName();//Getters and Setters
		
		
		ConstructorInjectionClass inject  = (ConstructorInjectionClass) context.getBean("ref_inject");
		inject.print();//Constructor Injection
		
		context.registerShutdownHook();
		
	}

}
