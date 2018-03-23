package com.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.model.Circle;

@Aspect
public class LoggingAspect {
	
	/*---------------------------------------------------------*/
	// for running the advice before the target method
	
	/*@Before("execution(* get*())")
	public void loggingAdvice() {
		
		System.out.println("Advice is running , and the get method is called");
		
	}*/
	
	/*--------------------------------------------------------*/
	
	// for running the advice method before the target method
	
	/*@Before("execution(* set*(..))")
	public void loggingAdvice() {
		
		System.out.println("Advice is running , and the SETT method is called");
		
	}*/
	
	/*---------------------------------------------------------*/
	
	// for running the advice after the target method
	
	/*@After("execution(* get*())")
	public void loggingAdvice() {
		
		System.out.println("Advice is running , and the get method is called");
		
	}*/
	
	
	
	/*---------------------------------------------------------*/
	// for the advices to be run before and after the target method
	
	/*@Before("execution(* get*())")
	public void logginBeforegAdvice() {
		
		System.out.println("Advice is running , and the get method is called----------Before");
		
	}
	
	@After("execution(* get*())")
	public void loggingAfterAdvice() {
		
		System.out.println("Advice is running , and the get method is called------After");
		
	}*/
	
	/*---------------------------------------------------------*/
	// using pointcut to make the code as simple as possible
	
	/*@Pointcut("execution(* get*())")
	public void allGetters() {
		
	}
	
	
	 
	 @Before("allGetters()")
	public void logginBeforegAdvice() {
		
		System.out.println("Advice is running , and the get method is called--------Before");
		
	}
	
	@After("allGetters()")
	public void loggingAfterAdvice() {
		
		System.out.println("Advice is running , and the get method is called---------After");
		
	}*/
	 	 
	
	/*----------------------------------------------------------*/
	
	// now u want to run the method only for the circle class methods
	
	/*@Pointcut("within(com.model.Circle)")
	public void forAllCircleMethods() {
		
	}
	
	@Before("forAllCircleMethods()")
	public void forallcirclemethods() {
		System.out.println("forAllCircle Methods advice is executed");
	}*/
	
	/*-----------------------------------------------------------*/
/*------------------------------------------------------------------*/
	
	// using around annotation , we can make the method to be executed before and after the target method execution
	
	/*@Pointcut("execution(* get*())")
	public void forAllGetters() {
		
	}
	
	@Around("forAllGetters()")
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
		
	}*/
	
	/*-----------------------------------------------------------------*/
	
	
	// combining different annotations 
	
	/*@Before("allGetters() && forAllCircleMethods()")
	public void loggingAdvice() {
		System.out.println("loggingAdvice is running , and the get method is called");
	}
	
	@Before("allGetters()")
	public void allGettersAdvice() {
		System.out.println("allGetters advice is executed");
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {
		
	}
	
	@Pointcut("within(com.model.Circle)")
	public void forAllCircleMethods() {
		
	}*/
	
	/*----------------------------------------------------------*/
	
	// the following method will be executed if and only if the target method is executed without throwing any exception or any other error .
	
	/*@AfterReturning("args(name)")
	public void stringArguments(String name) {
		System.out.println("a setter method is called which takes the argument " + name + " has been called---from AfterReturning ");
	}*/
	
	// the following method will be executed if the target method has thrown some exception
	
	/*@AfterThrowing("args(name)")
	public void afterThrowingException(String name) {
		System.out.println("a setter method has been called which takes the argument "+ name + " has been called---from AfterThrowing ");
	
	}*/
	
	
	// the following method will be executed for the target setAndReturnMethod method 
	
	/*@AfterReturning(pointcut="args(name)",returning="returnString")
	public void stringArgumentMethods(String name, String returnString) {
		System.out.println("A method that takes string arguments has been called" +" "+ name+"The output value is"+" "+ returnString);
	}*/
	
	// just like we are setting the name and returning the object after successfully implementing the target method , 
	// we can also catch the exception object and return it to the spriong aop if the target method has thrown some exception 
	
	/*@AfterThrowing(pointcut="args(name)",throwing="throwingObject")
	public void afterThrowingException(String name,Throwable throwingObject) {
		System.out.println("inside the AfterThrowException with the setter argument"+ name +" and the thrown Exception object is"+ throwingObject);
	}	*/
	
	
	/*----------------------------------------------------------*/
	
	
	
	
	/*---------------------------------------------------------------------------*/
	// custom annotations 
	
	/*@Around("@annotation(com.aspect.Loggable)")
	public Object myArounAdviceMethod(ProceedingJoinPoint proceedingJoinPoint) {
		
		Object returnObject=null;
		
		try {
		
		System.out.println("before advice");
		returnObject=proceedingJoinPoint.proceed();
		System.out.println("after advice");
		}
		catch(Throwable e) {
			System.out.println("after returning");
		}
		
		System.out.println("After finally");
		return returnObject;
	}*/
	
	/*---------------------------------------------------------------------------*/
	
}
