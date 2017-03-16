package com.java.oops;

public class C34InhExec {

	public static void main(String[] args) {
		
		/*if you create instance for parent and takes it as parent then
		 * only parent class members will be executed
		 */
		C32InhDemoMaths m1 = new C32InhDemoMaths();
		System.out.println(m1.demoAdd1(2, 3));

		/*if you create instance for child and takes it as child then
		 * parent and child class members will be executed
		 * 
		 * first preference to child class
		 * if there is a same method in child and parent then it executes from child
		 */
		C33inhDemoMathsKid m2 = new C33inhDemoMathsKid();
		System.out.println(m2.demoAdd1(20, 30));
		
		System.out.println(m2.demoAdd2(10, 20, 30));
		/*if you create instance for child and takes it as parent then
		 * parent class members will be executed if they are not overridden by child class
		 * if they are overridden then child class members will be executed
		 */
		
		C32InhDemoMaths m3 = new C33inhDemoMathsKid();
		System.out.println(m3.demoAdd1(500, 1000));
	}

}






