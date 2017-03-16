package com.java.oops;

public class C30EncExample {
	/*
	 * Encapsulation in Java is a mechanism of wrapping the data (variables) and
	 * code acting on the data (methods) together as a single unit
	 * 
	 * we can secure the data if we use encapsulation concept
	 * 
	 * public int empage; complete control to other classes
	 * private int empage; no access to other classes
	 * public final int empage; read only access to any class
	 * 
	 * to implement a restricted access for the variables
	 * 1) make variables private
	 * 2) make public methods for giving and taking the data
	 * 3) implement conditions when taking the data from out side
	 * these methods are called as setters and getters
	 * 
	 * we can achieve data hiding using encapsulation 
	 */
	private int age=20;

	//getter
	public int getAge(){
		return age;
	}
	//setter
	public void setAge(int empAge){
		if(empAge<18){
			System.out.println("employee age must be greater than 18");
		}else if(empAge>65){
			System.out.println("employee age must be less than 65");
		}else{
			age=empAge;
			System.out.println("employee age updated "+age);
		}
	}
}







