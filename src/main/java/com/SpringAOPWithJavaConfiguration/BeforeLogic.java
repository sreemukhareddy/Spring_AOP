package com.SpringAOPWithJavaConfiguration;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeLogic implements MethodBeforeAdvice{

	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("inside the before method");
		
		System.out.println("PassedArguemnts");
		for(Object arg: args )
			System.out.println(arg);
		
		
		// if you want to know additional features like the method name , passed argument ,target object 
		/*
		  System.out.println("target Object:"+target);  
		  System.out.println("method info:"+method.getName()+" "+method.getModifiers());  
		 */
		
	}
	
}