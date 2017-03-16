package com.wd.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.wd.locators.OhrmLoc;

public class OhrmAddEmpPOM {

	public static void main(String[] args) {
		
		OhrmPOMIntegrate ohrm = new OhrmPOMIntegrate();
		ohrm.OpenApplication("chrome", "http://opensource.demo.orangehrmlive.com/");
		ohrm.loginPage.enterTextOnUserName("admin");
		ohrm.loginPage.enterTextOnPassword("admin");
		ohrm.loginPage.clickOnLoginButton();
		ohrm.welcomePage.clickOnPIMLink();
		ohrm.welcomePage.clickOnAddEmployeeLink();
		ohrm.addEmpPage.enterTextOnFirstName("selenium");
		ohrm.addEmpPage.enterTextOnLastName("hq");
		ohrm.addEmpPage.clickOnSaveButton();
	}

}






