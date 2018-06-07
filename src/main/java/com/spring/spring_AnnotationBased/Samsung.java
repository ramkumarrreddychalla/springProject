package com.spring.spring_AnnotationBased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //Non qualified and DeCapitalized
public class Samsung {

	@Autowired
	//@Qualifier("snapDragon") // or Primary 
	MobileProcessor cpu;
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("Octa core, 4 GB RAM, 12MP camera");
		cpu.process();
	}
}
