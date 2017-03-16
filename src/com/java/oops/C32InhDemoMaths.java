package com.java.oops;

public class C32InhDemoMaths {

	//inheritance: inheriting features from parent to child
	//we use extends keyword for inheriting features
	
	/*
	 * we can develop more features by not disturbing the existing class
	 * we can extend and develop more features in child class
	 * for existing features you dont need to develop new code
	 * 
	 * you can even override existing features using child class
	 */
	
	/*polymorphism
	 * 
	 * we can write the same method with different forms
	 * the parameters must be different
	 * 
	 * this concept is called method overloading
	 * 	same method name and different parameters will become method overloading
	 * 
	 * same method name with same definitions will becom method over riding
	 * method overriding can be done child class
	 */
	public int demoAdd1(int a,int b){
		System.out.println("demo1 executed from parent");
		return a+b;
	}
	
	public int demoAdd1(int a,short b){
		System.out.println("demo1 executed from parent");
		return a+b;
	}
}






