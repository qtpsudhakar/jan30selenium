package com.wd.pof;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.wd.locators.OhrmLoc;

public class OhrmAddEmpPOF {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		OhrmPOFIntegrate ohrm = new OhrmPOFIntegrate();	
		
		ohrm.OpenApplication("chrome", "http://opensource.demo.orangehrmlive.com/");
		HashMap<String, String> tData = ohrm.readData.readDataFromTC("TC_OHRM_0002");
		ohrm.loginPage.enterTextOnUserName(tData.get("username"));
		ohrm.loginPage.enterTextOnPassword(tData.get("password"));
		ohrm.loginPage.clickOnLoginButton();
		ohrm.welcomePage.clickOnPIMLink();
		ohrm.welcomePage.clickOnAddEmployeeLink();
		ohrm.addEmpPage.enterTextOnFirstName(tData.get("firstname"));
		ohrm.addEmpPage.enterTextOnLastName(tData.get("lastname"));
		ohrm.addEmpPage.clickOnSaveButton();
	}

}






