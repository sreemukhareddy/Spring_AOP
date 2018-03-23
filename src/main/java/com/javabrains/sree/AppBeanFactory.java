package com.javabrains.sree;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class AppBeanFactory {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		
		BeanFactory bean=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle triangle=(Triangle)bean.getBean("triangle");
		triangle.draw();
	}

}
