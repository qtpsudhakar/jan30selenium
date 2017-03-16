package com.tng.basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoTest4 {

	@Test(dataProvider="dp1")
	public void test1(String p1,String p2){
		System.out.println("this is test1");
		System.out.println(p1);
		System.out.println(p2);
	}
	
	@Test
	public void test2(){
		System.out.println("this is test2");
	}

	@DataProvider(name="dp1")
	public String[][] genData1(){
		
		String[][] strData = new String[2][2];
		//first iteration
		strData[0][0]="aaa";
		strData[0][1]="bbb";
		
		//sencond iteration
		strData[1][0]="ccc";
		strData[1][1]="ddd";
		
		return strData;
		
	}
	
	@DataProvider(name="login")
	public String[][] genLoginData(){
		
		String[][] strData = new String[1][2];
		//first iteration
		strData[0][0]="admin";
		strData[0][1]="admin";
		
		return strData;
		
	}

}












