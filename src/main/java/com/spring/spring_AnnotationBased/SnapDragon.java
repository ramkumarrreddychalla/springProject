package com.spring.spring_AnnotationBased;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements MobileProcessor {

	public void process() {
		System.out.println("Worlds Best CPU!");

	}

}
