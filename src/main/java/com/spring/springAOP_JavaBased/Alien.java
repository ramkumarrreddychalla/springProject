package com.spring.springAOP_JavaBased;

import org.springframework.stereotype.Component;

/**
 * 
 * @author yadhu
 *
 */
@Component
public class Alien {
	

	private String myName;
	
	public String getMyName() {
		System.out.println("Hello "+myName);
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public void show() {

		System.out.println("Hello World "+myName+"!!!");
		
		
				
		
		//  Business logic can be written here
		// all the logging file(we maintain log file at the time of execution start and end)
		// mostly in enterprise applications
		//and other operations file like security code or maintaining transactions involving DataBases
		// we begin the transaction in the beginning and 
		//once the transaction is ended we commit so the changes are saved to the DataBase
		
		//log ---> 2 lines of code
		// security ---> 1 line of code
		//transaction ---> Begin 
		
		//Business logic ---> 15 lines ---> this is the only thing which will 
		//change and other lines remain same for all the programming aspect
		
		//transaction ---> commit
		//log ---> 2 lines to end
//-----------------------------------------------------------------------------------------------------------------------
		
		
		// Business logic ---> only this should exits 
		// all other things like logging and security and transactions will be handled by the AOP
	}
}
