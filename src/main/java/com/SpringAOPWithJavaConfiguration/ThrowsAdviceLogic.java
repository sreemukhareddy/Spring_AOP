package com.SpringAOPWithJavaConfiguration;

import org.springframework.aop.ThrowsAdvice;

public class ThrowsAdviceLogic implements ThrowsAdvice{
	
	public void afterThrowing(Exception exception) {
		System.out.println("im in the afterThrowing method because the target method has thrown some exception");
		System.out.println("the exception is " + exception.toString());
	}
}
