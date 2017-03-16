package com.wd.pof;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOF {
	
	public static WebDriver driver;

	public LoginPagePOF(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//identification methods

	@FindBy(id="btnLogin") WebElement btnLogin;
	@FindBy(id="txtPassword") WebElement txtPassword;
	@FindBy(id="txtUsername") WebElement txtUsername;
	
	public void enterTextOnUserName(String val){
		txtUsername.sendKeys(val);
		System.out.println(val+" entered on username text box");
	}
	public void enterTextOnPassword(String val){
		txtPassword.sendKeys(val);
		System.out.println(val+" entered on password text box");
	}
	public void clickOnLoginButton(){
		btnLogin.click();
		System.out.println("clicked on login button");
	}
}








