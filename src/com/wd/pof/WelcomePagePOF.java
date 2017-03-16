package com.wd.pof;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePagePOF {
	
	public static WebDriver driver;

	public WelcomePagePOF(WebDriver driver){
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	//identification methods
	
	@FindBy(linkText="PIM") WebElement lnkPIM;
	@FindBy(linkText="Add Employee") WebElement lnkAddEmployee;
	
	//operations
	
	public void clickOnPIMLink(){
		lnkPIM.click();
		System.out.println("clicked on PIM link");
	}
	public void clickOnAddEmployeeLink(){
		lnkAddEmployee.click();
		System.out.println("clicked on Add Employee link");
	}
}








