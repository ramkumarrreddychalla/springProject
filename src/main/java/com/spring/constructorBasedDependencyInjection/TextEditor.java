package com.spring.constructorBasedDependencyInjection;

import com.spring.constructorBasedDependencyInjection.SpellChecker;

public class TextEditor {

	private SpellChecker spellChecker;

	// a constructor method to inject the dependency.
	public  TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker." );
		this.spellChecker = spellChecker;
		System.out.println(spellChecker);
	}
	
	public void spellChecker() {
		spellChecker.checkSpelling();
	}

}
