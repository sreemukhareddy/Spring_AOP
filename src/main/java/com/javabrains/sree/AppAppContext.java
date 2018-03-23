package com.javabrains.sree;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppAppContext {

	public static void main(String[] args) {
		
		//AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		//Triangle tri=(Triangle)context.getBean("triangle");
		//tri.draw();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		//context.registerShutdownHook();
		
		Shape s=(Shape)context.getBean("circle");
		s.draw();
		
	}

}
