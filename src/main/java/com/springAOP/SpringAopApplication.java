package com.springAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.ShapeService;

public class SpringAopApplication {

	public static void main(String[] args) {
		
		/*ApplicationContext context= new ClassPathXmlApplicationContext("springAOP.xml");
	
		
		ShapeService shapeService= context.getBean("shapeService",ShapeService.class);
		
		shapeService.getCircle().setName("dummy circle"); // setting the circle name
		
		//shapeService.getCircle().setAndReturn("dummy Circle");
		
		System.out.println(shapeService.getCircle().getName()); // getting the circle name
*/		
		
		
		/*shapeService.getTriangle().setName("dummy triangle"); // setting the circle name
		
		System.out.println(shapeService.getTriangle().getName()); // getting the circle name
		*/
		
		
		
		
		
		// using spring aop with xml
		
		ApplicationContext context= new ClassPathXmlApplicationContext("springAopWithXML.xml");
		
		ShapeService shapeService= context.getBean("shapeService",ShapeService.class);
		
		shapeService.getCircle().setName("dummy circle"); // setting the circle name
		
		//shapeService.getCircle().setAndReturn("dummy Circle");
		
		System.out.println(shapeService.getCircle().getName()); // getting the circle name
		
		
		((ConfigurableApplicationContext)context).close();
	}
}
