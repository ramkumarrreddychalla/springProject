package com.spring.spring_AnnotationBased;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DogDragon implements MobileProcessor {

	public void process() {
		System.out.println("Worlds 2nd Best CPU!");

	}
}