package com.SpringAOPWithJavaConfiguration;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringWithJava.xml");
		
		Target t=context.getBean("proxyAOP",Target.class);
		//Target t=context.getBean("myPointcut",Target.class);
		t.setMethod(22);
		System.out.println(t.getMethod());
		
		
		((ClassPathXmlApplicationContext) context).close();
	}

}
