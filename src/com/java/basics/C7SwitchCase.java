package com.java.basics;

public class C7SwitchCase {

	public static void main(String[] args) {
		// find capital of the state
		
		String stateCode = "ts";
		
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
