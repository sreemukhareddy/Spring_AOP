package com.SpringAOPWithJavaConfiguration;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterLogic implements AfterReturningAdvice {

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("inside the after method");
		
		System.out.println("Passed argument");
		for(Object arg:args)
			System.out.println(arg);
		
		
	}

}
