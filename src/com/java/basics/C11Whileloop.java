package com.java.basics;

import java.util.Scanner;

public class C11Whileloop {

	public static void main(String[] args) {

		// while loop is condition based
		//it execute the block until condition fails

		// print values from 1 to 10

		Scanner scn = new Scanner(System.in);
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			System.out.println("give value for i");
			i = scn.nextInt();
		}

	}

}
