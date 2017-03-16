package com.java.basics;

public class C10Forloop {

	public static void main(String[] args) {
		// print value 10 for 1 time

		System.out.println(10);

		// print value 10 for 5 times
		for (int i = 1; i <= 5; i++) {
			System.out.println(10);
		}

		// print values from 1 to 10
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		// print values from 10 to 1

		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		// print odd numbers between 1 to 20
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

		// print odd numbers between 1 to 20 without using if
		for (int i = 1; i <= 20; i+=2) {
			System.out.println(i);
		}
	}

}




