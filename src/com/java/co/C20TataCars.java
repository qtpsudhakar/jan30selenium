package com.java.co;

public class C20TataCars {
	public String brand;
	public static String model;
	private int i=0;
	
	//static variable used for maintaining single value across multiple instances
	//instance variables used for maintaining different values across multiple instances
	
	//static variables/methods not required to have instance for reusing
	//without instance also we can access static variables/methods
	
	//static methods can access static variables/methods directly
	//to access instance variables/methods from static methods we must create instance
	
	//we can access instance/static variables/methods from instance methods without creating instance
	//This is when accessing the variables/methods of same class
	
	//if you want to reuse static methods/variables in other class you have to access them using classname or instance
	//if you want to reuse instance methods/variables in other class you have to access them using instance
	
	
	public static void main(String[] args) {
		
		C20TataCars car1 = new C20TataCars();
		car1.brand="tata";
		model="2016";
		
		C20TataCars car2 = new C20TataCars();
		car2.brand="tatamotors";
		model="2017";
		
		System.out.println(car1.brand);
		System.out.println(car1.model);
		car1.start();
		System.out.println(car2.brand);
		System.out.println(car2.model);
		car2.start();
	}

	//create a method start
	public static void start(){
		System.out.println("car is started");
	}
	
	public void SpeedUp(){
		i=i+10;
		System.out.println("car is speed is up:"+i);
	}
}





