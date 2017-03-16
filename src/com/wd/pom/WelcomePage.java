package com.wd.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WelcomePage {
	
	public static WebDriver driver;

	public WelcomePage(WebDriver driver){
		this.driver=driver;
	}
	
	//identification methods
	public WebElement lnkPIM(){
		//write code for identifying element
		return driver.findElement(By.linkText("PIM"));
	}
	public WebElement lnkAddEmployee(){
		//write code for identifying element
		return driver.findElement(By.linkText("Add Employee"));
	}
	
	//operations
	
	public void clickOnPIMLink(){
		lnkPIM().click();
		System.out.println("clicked on PIM link");
	}
	public void clickOnAddEmployeeLink(){
		lnkAddEmployee().click();
		System.out.println("clicked on Add Employee link");
	}
}








