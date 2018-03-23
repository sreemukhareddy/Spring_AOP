package com.model;

public class Circle {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("circle's setter method has been called");
		this.name = name;
		throw(new RuntimeException());
	}
	
	public String setAndReturn(String name) {
		this.name=name;
		System.out.println("inside set and return method"+" "+ name);
		return "myReturnedObject";
	}
	
}
