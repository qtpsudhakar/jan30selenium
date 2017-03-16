package com.java.basics;

public class C4TypeCast {

	public static void main(String[] args) {
		
		//Automatic typecast/implicit typecast
		//storing lower range type variable data in higher range type variable
		byte b=10;
		int x = b;
		System.out.println(x);
		
		//explicit cast
		//storing higher range type variable data in lower range type variable
		
		short s = 120;
		b=(byte) s;
		System.out.println(b);
		
		//convert from string to int
		String str1 = "10";
		String str2 = "20";
		
		System.out.println(str1+str2);
		int n1 = Integer.parseInt(str1);
		int n2 = Integer.parseInt(str2);
		System.out.println(n1+n2);		
		
		//Integer is a reference datatype
	}

}






