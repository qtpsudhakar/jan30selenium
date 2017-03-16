package com.wd.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public static WebDriver driver;

	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	//identification methods

	public WebElement btnLogin(){
		//write code for identifying element
		return driver.findElement(By.id("btnLogin"));
	}
	public WebElement txtPassword(){
		//write code for identifying element
		return driver.findElement(By.id("txtPassword"));
	}
	public WebElement txtUsername(){
		//write code for identifying element
		return driver.findElement(By.id("txtUsername"));
	}
	
	public void enterTextOnUserName(String val){
		txtUsername().sendKeys(val);
		System.out.println(val+" entered on username text box");
	}
	public void enterTextOnPassword(String val){
		txtPassword().sendKeys(val);
		System.out.println(val+" entered on password text box");
	}
	public void clickOnLoginButton(){
		btnLogin().click();
		System.out.println("clicked on login button");
	}
}








