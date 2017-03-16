package com.tng.basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demotest1 {

	
	@Test(priority=1)
	public void demo1() {
		System.out.println("this is test1");
	}
	
	@Test(priority=2)
	public void demo2() {
		System.out.println("this is test2");
	}
	
	@BeforeMethod
	public void bm1(){
		System.out.println("this is before test method");
	}
	
	@BeforeClass
	public void bc1(){
		System.out.println("this is before class");
	}
	
	@AfterMethod
	public void am1(){
		System.out.println("this is after method");
	}
	
	@AfterClass
	public void ac1(){
		System.out.println("this is after class");
	}
}






