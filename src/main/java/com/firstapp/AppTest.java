package com.firstapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
	public static void main(String[] args) {
		
		ApplicationContext at=new ClassPathXmlApplicationContext("spring.xml");
		HelloWorld hw=(HelloWorld)at.getBean("helloWorld");
		hw.print();
		
	}

}
