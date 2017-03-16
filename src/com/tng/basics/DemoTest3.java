package com.tng.basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTest3 {

	@BeforeTest
	public void bt1(){
		System.out.println("This is before test");
	}
	
	@AfterTest
	public void at1(){
		System.out.println("this is after test");
	}
}






