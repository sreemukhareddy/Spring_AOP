package com.SpringAOPWithJavaConfiguration;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdviceLogic implements MethodInterceptor{

	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		Object obj=null;
		
		System.out.println("before the business logic");
		Object[] args=invocation.getArguments();
		System.out.println("the argument passed id");
		for(Object arg: args) {
			System.out.println(arg);
			obj=arg;
		}
		
		int custom=(Integer)obj;
		custom+=22;
		
		invocation.proceed();
		
		System.out.println("after the business logic");
		
		return custom;
		
		
		
	}

}
