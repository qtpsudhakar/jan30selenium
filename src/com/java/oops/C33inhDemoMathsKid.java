package com.java.oops;

public class C33inhDemoMathsKid extends C32InhDemoMaths{
	
	public int demoAdd2(int a, int b, int c){
		System.out.println("demo2 executed from child");
		return a+b+c;
	}
	
	public int demoAdd1(int a,int b){
		System.out.println("demo1 executed from child");
		return a+b+a;
	}
}
