package com.java.basics;

import java.util.Scanner;

public class C8SwitchCase_UserInput {

	public static void main(String[] args) {
		// find capital of the state
		
		//create instance for scanner class for taking console input
		Scanner scan = new Scanner(System.in);
				
		System.out.println("enter statecode");
		
		//scan.next() will ask for string input
		//scan.nextInt() will ask for integer input
		
		String stateCode = scan.next();
		
		switch(stateCode){
		case "ap":
			System.out.println("amaravathi");
		case "ts":
			System.out.println("hyderabad");
			break;
		case "tn":
			System.out.println("chennai");
			break;
		default:
			System.out.println("invalid statecode");
		}


	}

}
