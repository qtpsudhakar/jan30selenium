package com.java.ac1;

import com.java.ac.C23Access1;

//extends is to create sub class for parent class
public class C25Access3 extends C23Access1{

	public static void main(String[] args) {
		
		C23Access1 ac = new C23Access1();
		System.out.println(ac.pb);
		System.out.println(ac.pr1);
		
		C25Access3 ac3 = new C25Access3();
		System.out.println(ac3.pr);
		System.out.println(ac3.pb);
		System.out.println(C25Access3.pr1);

		C25Access3.pr1 = "change1";
		System.out.println(C25Access3.pr1);
		System.out.println(C23Access1.pr1);
		
		C23Access1.pr1 = "change2";
		System.out.println(C25Access3.pr1);
		System.out.println(C23Access1.pr1);
	}

}





