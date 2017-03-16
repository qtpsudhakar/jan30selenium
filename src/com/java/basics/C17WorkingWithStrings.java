package com.java.basics;

import java.util.Scanner;

public class C17WorkingWithStrings {

	public static void main(String[] args) {

		// compare
		// length
		// verifying standards:Regular Expressions
		// getting sub string
		// verify sub string
		// reverse string

		// compare strings
		String str1 = "selenium";
		String str2 = "selenium";

		if (str1 == str2) {
			System.out.println("both are equal");
		} else {
			System.out.println("strings are not equal");
		}

		// Comparison when you get string from outside
		System.out.println("enter string for str3");
		String str3 = "abc";

		if (str1.equalsIgnoreCase(str3)) {
			System.out.println("both are equal");
		} else {
			System.out.println("strings are not equal");
		}

		if (str1.compareToIgnoreCase(str3) == 0) {
			System.out.println("both are equal");
		} else {
			System.out.println("strings are not equal");
		}

		// get length of a string
		System.out.println(str1.length());

		// find substring exist
		String str4 = "hello hi how are you";

		if (str4.indexOf("xyz") >= 0) {
			System.out.println("string exist");
		} else {
			System.out.println("string is not exist");
		}

		// find how many times a string exist in another

		// initial zero value for condition
		int i = 0;
		// initialize a counter
		int cnt = 0;
		// if string not found after some index it will return -1
		// exit while if it returns -1
		while (i >= 0) {
			// get the position of the string
			i = str4.indexOf("h", i);
			// if the string exist increase counter and update search index
			if (i >= 0) {
				i++;
				cnt = cnt + 1;
			}
		}

		System.out.println(cnt);

		// logic 2
		int cnt1 = 0;
		for (int j = 0; j < str4.length(); j++) {
			// get sub string from each index of the string
			String sStr = str4.substring(j, j + 1);
			// if string is equal increase counter
			if (sStr.equals("h")) {
				cnt1++;
			}
		}
		System.out.println(cnt1);

		// reverse a string
		String str6 = "selenium";
		String tStr = "";

		// start for loop in reverse order using string length
		for (int j = str6.length() - 1; j >= 0; j--) {
			// get substring from end position and store it
			// method1
			// tStr=tStr+str6.substring(j, j+1);
			// method2
			tStr = tStr + str6.charAt(j);
		}
		// print reversed string
		System.out.println(tStr);

		// split a string in to words
		String aStr[] = str4.split(" ");
		for (String st : aStr) {
			System.out.println(st);
		}
		// replace string
		System.out.println(str4.replace("h", "q"));

		// trim the spaces of a string
		String str7 = "      selenium     ";
		System.out.println(str7);
		System.out.println(str7.trim());
		// convert case
		String str8 = "   WebDriver   ";
		System.out.println(str8);
		System.out.println(str8.toLowerCase());
		System.out.println(str8.toUpperCase());
		System.out.println(str8.trim().toLowerCase());
	}

}
