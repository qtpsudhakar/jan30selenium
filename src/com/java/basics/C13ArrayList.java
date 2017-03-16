package com.java.basics;

import java.util.ArrayList;
import java.util.List;


public class C13ArrayList {

	public static void main(String[] args) {
		
		//Array list is to store dynamic data
		//We dont need to specify size
		//It can add only reference data types
		
		//create an array list to add values
		
		//if you dont specify datatype while defining array it become object type
		
		List al = new ArrayList();
		
		al.add(10);
		al.add("selenium");
		al.add(1.123);
		al.add(1, "webdriver");
		
		//create array to add numbers
		ArrayList<Integer> iArr= new ArrayList();
		iArr.add(10);
		iArr.add(20);
		
		//get values count from arraylist
		System.out.println(al.size());
		System.out.println(iArr.size());
		
		//print values from arraylist
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		
		//print values using extended for loop
		
		for(int obj:iArr){
			System.out.println(obj);
		}
		
		//create and print array
		int ar[] = {10,20,30,40,50};
		for(int i=0;i<ar.length;i++){
			System.out.println(ar[i]);
		}
				
		for(int i:ar){
			System.out.println(i);
		}
		
		
	}

}










