package com.java.basics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class C15HashMap {

	public static void main(String[] args) {
		
		//map is to store data using a key name instead of index number
		
		HashMap userDetails = new HashMap();
		userDetails.put("environment", "test");
		userDetails.put("uname", "selenium");
		userDetails.put("password", "qwerty");		
		
		
		System.out.println(userDetails.get("uname"));
		System.out.println(userDetails.get("password"));
		
		ArrayList lst = new ArrayList();
		lst.add("asf");
		lst.add("selenium");
		lst.add("qwerty");
		
		System.out.println(lst.get(0));
		System.out.println(lst.get(1));
		
		//print only key names
		Object[] st = userDetails.keySet().toArray();
		for(Object obj:st){
			System.out.println(obj);
		}
		
		//print only values
		Object[] val = userDetails.entrySet().toArray();
		for(Object obj:val){
			System.out.println(obj);
		}
	}

}





