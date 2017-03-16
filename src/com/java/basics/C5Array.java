package com.java.basics;

public class C5Array {

	public static void main(String[] args) {
		// Arrays are used to store multiple values in a single variable using an index number
		
		//store two numbers in a variable
		
		int i[]=new int[2];
		
		
		//array index starts from zero
		i[0]=10;
		i[1]=20;
		System.out.println(i[0]);
		System.out.println(i[1]);

		//create array without using new
		int j[] = {10,20,30};
		
		System.out.println(j[0]);
		System.out.println(j[1]);
		System.out.println(j[2]);
		
		//store multiple datatype values in a single variable
		Object obj[]=new Object[2];
		obj[0]=10;
		obj[1]="selenium";
		System.out.println(obj[0]);
		System.out.println(obj[1]);
		
		
		//Storing table kind of data in variable
		//00,01,02,10,11,12
		
		Object obj1[][] =new Object[2][3];
		obj1[0][0]="10";
		obj1[0][1]="100";
		obj1[0][2]="web";
		obj1[1][0]="100";
		System.out.println(obj1[0][0]);
		System.out.println(obj1[1][1]);
	}

}





