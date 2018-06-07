package com.spring.springAOP_JavaBased;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * 
 * @author yadhu
 *
 */

//Advice --> what? means when show() of Alien is called I want call log() 
//We have 5 advice : Before, After, after-running, after-throwing, around

//Point Cut is a jargon to define where or when? ---> ("execution(public void show()")

@Component
@Aspect
@EnableAspectJAutoProxy //to enable AOP

public class LoggingClass {
	
	
	@Before("execution(public void show())")
	public void logStart() {
		System.out.println("Show Logging file");
	}
	
	/*@AfterReturning(pointcut = "execution(public void show())", returning = "retVal")
	public void doAfterReturnningTask(Object retVal) {
		System.out.println("Returning:"+retVal.toString()); // while returning a value 
	}*/ 
	
	
	@After("execution(public void show())")
	public void logEnd() {
		System.out.println("End Logging file");
	}
	
	@AfterThrowing(pointcut = "execution(public void show())", throwing = "ex")
	 public void AfterThrowingAdvice(IllegalArgumentException ex){
		 System.out.println("There has been an exception: " + ex.toString());   
	 }
}
