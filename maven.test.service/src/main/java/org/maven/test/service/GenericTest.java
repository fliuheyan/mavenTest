package org.maven.test.service;

import java.util.ArrayList;

public class GenericTest<T> {
	private ArrayList<T> storage = new ArrayList<T>();
	
	public ArrayList<T> getStorage(){
		return storage;
	}
	
	public static void changeStr(String str){
		str = "aaa";
	}
	
	public static boolean foo(char c){
		System.out.print(c);
		return true;
	}
	
	public static void main(String[] args){
//		GenericTest<String> gen = new GenericTest<String>();
//		for(String s : "cloud test String".split(" ")){
//			gen.getStorage().add(s);
//		}
		
//		String str = "bb";
//		changeStr(str);
//		System.out.println(str);
		
		int i = 0;
		for(foo('A');foo('B')&&(i<2);foo('C')){
			i++;
			foo('D');
		}
	}
}
