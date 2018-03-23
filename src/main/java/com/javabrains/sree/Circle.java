package com.javabrains.sree;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import javax.annotation.*;

@Component
public class Circle implements Shape,ApplicationEventPublisherAware{

	/*public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}*/

	private Point center;
	private ApplicationEventPublisher publisher;
	
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet");
	}
	public Point getCenter() {
		return center;
	}
	@Resource(name="pointCC")
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		
		System.out.println("drawing circle");
		System.out.println(center.getX()+""+center.getY());
		
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
		
		//throw new RuntimeException();
	}
	/*@PostConstruct
	public void initilize() {
		System.out.println("circle initialize is called");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destroy of circle is called");
	}*/
	
	
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		
		this.publisher= publisher;
	}
	
}
