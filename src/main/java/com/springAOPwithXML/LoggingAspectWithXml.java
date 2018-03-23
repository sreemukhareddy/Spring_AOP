package com.springAOPwithXML;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspectWithXml {

	public Object myArounAdviceMethod(ProceedingJoinPoint proceedingJoinPoint) {
		
		Object returningObject=null;
		
		try {
		
		System.out.println("before advice");
		returningObject=proceedingJoinPoint.proceed();
		System.out.println("after advice");
		}
		catch(Throwable e) {
			System.out.println("after returning");
		}
		System.out.println("after finally");
		
		return returningObject;
		
	}
	
	public void before() {
		System.out.println("the method is called before the getter methods of the circle class ");
	}
	
	public void after() {
		System.out.println("after setting the method with the arguments");
	}
	
	public void afterReturning(JoinPoint jp,String myReturnedObject) {
		System.out.println("inside the afterReturning method ");
		System.out.println("method signature "+ jp.getSignature());
		System.out.println("returned object is "+ myReturnedObject);
	}
	
	public void afterThrowing() {
		System.out.println("inside the after throwing method");
	}
	
	public void afterThrowingAndCatchingTheException(JoinPoint jp,Throwable exception) {
		System.out.println("inside the after throwing and catching the exception ");
		System.out.println("Method signature is "+ jp.getSignature() );
		System.out.println("and the exception is "+ exception.toString());
	}
	
	
	
}
