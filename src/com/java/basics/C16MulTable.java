package com.java.basics;

import java.util.Scanner;

public class C16MulTable {

	public static void main(String[] args) {
		// Display 2nd table

		// 2*1=2

		System.out.println("enter number");
		int n = new Scanner(System.in).nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + "=" + n * i);
		}

	}

}



