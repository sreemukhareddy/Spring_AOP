package com.SpringAOPWithJavaConfiguration;

public class Target {
	
	int num;
	
	public void setMethod( int num) {
		this.num=num;
		System.out.println("im in the Target class method and the passed argument is "+this.num);
		throw(new RuntimeException());
	}
	
	public int getMethod() {
		return num;
	}
}

