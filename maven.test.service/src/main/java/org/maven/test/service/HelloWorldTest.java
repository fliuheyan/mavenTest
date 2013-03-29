package org.maven.test.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class HelloWorldTest extends TestCase {
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		HelloWorld hl = (HelloWorld)context.getBean("helloBean");
		System.out.print("HelloWorld" + hl.getName());
	}
}
