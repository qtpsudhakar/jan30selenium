package com.tng.ohrm;

import java.util.HashMap;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataGeneratorTest {

	@DataProvider(name="login")
	public static String[][] genLoginData(){
		
		String[][] strData = new String[1][2];
		//first iteration
		strData[0][0]="admin";
		strData[0][1]="admin";
		
		return strData;
		
	}
	
	@DataProvider(name="AddEmployee")
	public static String[][] genAddEmpData(){
		
		String[][] strData = new String[1][2];
		//first iteration
		strData[0][0]="selenium";
		strData[0][1]="hq";
		
		return strData;
		
	}
	@DataProvider(name="all")
	public static Object[][] genOhrmEmpData(){
		
		Object[][] strData = new Object[1][1];
		
		HashMap<String, String>tData = new HashMap<String, String>();
		tData.put("username", "admin");
		tData.put("password", "admin");
		tData.put("firstname", "web");
		tData.put("lastname", "driver");
		
		strData[0][0]=tData;
		
		return strData;
		
	}
}







