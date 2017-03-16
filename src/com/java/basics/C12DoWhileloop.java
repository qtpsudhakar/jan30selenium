package com.java.basics;

import java.util.Scanner;

public class C12DoWhileloop {

	public static void main(String[] args) {

		// do while loop is condition based
		//it execute the block until condition fails
		//it excutes at least once

		// print values from 1 to 10

		Scanner scn = new Scanner(System.in);
		int i = 12;
		
		do {
			System.out.println(i);
			System.out.println("give value for i");
			i = scn.nextInt();
		}while (i <= 10);

	}

}
