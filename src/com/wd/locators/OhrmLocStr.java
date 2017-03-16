package com.wd.locators;

import org.openqa.selenium.By;

public class OhrmLocStr {
	public static String appUrl = "http://opensource.demo.orangehrmlive.com/";
	public static String txtUserName = "id;txtUsername";
	public static String txtPassword = "id;txtPassword";
	public static String btnLogin = "xpath;//input[@id='btnLogin']";
	public static String lnkPIM = "linkText;PIM";
	public static String lnkAddEmployee ="linkText;Add Employee";
	public static String txtFirstName ="id;firstName";
	public static String txtLastNAme ="id;lastName";
	public static String btnSave ="id;btnSave";

	public static By getLoc(String strLoc){
		String[] arrLoc = strLoc.split(";");
		
		switch(arrLoc[0].toLowerCase()){
		case "id":
			return By.id(arrLoc[1]);
		case "name":
			return By.name(arrLoc[1]);
		case "classname":
			return By.className(arrLoc[1]);
		case "tagname":
			return By.tagName(arrLoc[1]);
		case "linktext":
			return By.linkText(arrLoc[1]);
		case "partiallinktext":
			return By.partialLinkText(arrLoc[1]);				
		case "xpath":
			return By.xpath(arrLoc[1]);				
		case "cssselector":
			return By.cssSelector(arrLoc[1]);						
		}
		return null;
	}
}







