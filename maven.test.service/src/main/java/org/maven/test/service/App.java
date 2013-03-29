package org.maven.test.service;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("/resource/bean.xml");
		HelloWorld hl = (HelloWorld)context.getBean("helloBean");
		System.out.print("HelloWorld" + hl.getName());
//        System.out.println( "Hello World!" );
		
		
    }
}
