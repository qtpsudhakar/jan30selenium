package com.java.co;

import java.util.ArrayList;

import com.java.basics.Demo2;

public class C22MethodSamples {

	public static void main(String[] args) {
		// main methods is driver for the class
		// it is optional
		// we can create any number of methods in side class
		// void means the method is not returning a value
		// you will use void if you want perform some only some actions
		// if you want an output from method then we specify the datatype
		// instead void
		// you have to use return keyword for returning data

		C22MethodSamples ms = new C22MethodSamples();
		
		// calling a method
		ms.demoadd1();

		// calling a method which returns a value
		int x = ms.demoadd2();
		System.out.println(x);
		System.out.println(ms.demoadd2());

		//calling a method with parameters
		int y = ms.demoadd3(20, 30);
		System.out.println(y);
		
		System.out.println(ms.demoadd3(10, 20));
		
		//calling a method which returns array
		Object[] oddArray = ms.getOddNumbers(10, 40);
		
		for(Object od:oddArray){
			System.out.println(od);
		}
	}

	// write a method for adding two numbers
	public void demoadd1() {
		System.out.println(12 + 13);
	}

	// write a method for adding two numbers and returning a value
	public int demoadd2() {
		return (2 + 3);
	}

	// write a method which take two numbers as input and return a added value
	public int demoadd3(int a, int b) {
		return a + b;
	}
	
	//write a method to return multiple values
	//get odd number between 10 to 30
	public Object[] getOddNumbers(int rStart,int rEnd){
		
		ArrayList<Integer> oddNumbers = new ArrayList(); 
		for(int i=rStart;i<=rEnd;i++){
			if(i%2==1){
				oddNumbers.add(i);
			}
		}
		return oddNumbers.toArray();
	}
	//constructor
	//constructor will there with same class name without return type
	//this will be execute along with instance creation
	//this works a precondition and will be executed as the first method
	//we dont need to call constructor
	//constructor can parameters
	//if constructor is having parameter you must create class instance with input value
	public C22MethodSamples(){
		System.out.println("constructor executed");
		System.out.println();
	}
}







