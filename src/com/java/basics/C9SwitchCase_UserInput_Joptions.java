package com.java.basics;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class C9SwitchCase_UserInput_Joptions {

	public static void main(String[] args) {
		// find capital of the state

		// joptionpane is to create forms
		// showinputdialog will ask for user input and return a string

		String stateCode = JOptionPane.showInputDialog("enter state code");

		switch (stateCode) {
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
