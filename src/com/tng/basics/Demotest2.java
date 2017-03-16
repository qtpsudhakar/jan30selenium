package com.tng.basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demotest2 {

	
	@Test
	public void demo1() {
		System.out.println("this is test1 from demotest2");
	}
	
	@Test
	public void demo2() {
		System.out.println("this is test2 from demotest2");
	}
	
	@BeforeMethod
	public void bm1(){
		System.out.println("this is before test method from demotest2");
	}
	
	@BeforeClass
	public void bc1(){
		System.out.println("this is before class from demotest2");
	}
	
	@AfterMethod
	public void am1(){
		System.out.println("this is after method from demotest2");
	}
	
	@AfterClass
	public void ac1(){
		System.out.println("this is after class from demotest2");
	}
}






