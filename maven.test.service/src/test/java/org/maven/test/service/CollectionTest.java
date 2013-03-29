package org.maven.test.service;

public class CollectionTest {

	public <T> void f(T t){
		System.out.println(t.getClass().getClassLoader());
	}
	
	public <T> void abc(T t){
		
	}
}
