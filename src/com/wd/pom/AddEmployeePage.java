package com.wd.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddEmployeePage {
	
	public static WebDriver driver;

	public AddEmployeePage(WebDriver driver){
		this.driver=driver;
	}
	
	//identification methods

	public WebElement txtFirstName(){
		//write code for identifying element
		return driver.findElement(By.id("firstName"));
	}
	public WebElement txtLastNAme(){
		//write code for identifying element
		return driver.findElement(By.id("lastName"));
	}
	public WebElement btnSave(){
		//write code for identifying element
		return driver.findElement(By.id("btnSave"));
	}
	
	public void enterTextOnFirstName(String val){
		txtFirstName().sendKeys(val);
		System.out.println(val+" entered on firstname text box");
	}
	public void enterTextOnLastName(String val){
		txtLastNAme().sendKeys(val);
		System.out.println(val+" entered on lastname text box");
	}
	public void clickOnSaveButton(){
		btnSave().click();
		System.out.println("clicked on save button");
	}
}








