package com.tng.ohrm;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OhrmAddEmployee_DP_All {
	WebDriver driver;
	CommonMethods cm;
	HashMap<String, String> tcData;
	
	@BeforeClass
	@Parameters({"browser","appUrl"})
	
	public void openApplication(String brName,String aUrl) {
		cm = new CommonMethods();
		driver = cm.OpenBrowser(driver, brName, aUrl);

	}

	@Test(priority=1,dataProviderClass=DataGeneratorTest.class,dataProvider="all")
	public void Login(HashMap<String, String> dt) {
		tcData = dt;
		// enter text on user name
		driver.findElement(By.id("txtUsername")).sendKeys(tcData.get("username"));

		// enter password on password field
		driver.findElement(By.id("txtPassword")).sendKeys(tcData.get("password"));

		// click on login button
		driver.findElement(By.id("btnLogin")).click();
		Reporter.log("Login is completed with pass Status");
	}

	@Test(priority=2)
	public void AddEmployee() {
		// click on PIM link
		driver.findElement(By.linkText("PIM")).click();

		// click on add employee
		driver.findElement(By.linkText("Add Employee")).click();

		// enter first name
		driver.findElement(By.id("firstName")).sendKeys(tcData.get("firstname"));

		// enter last name
		driver.findElement(By.id("lastName")).sendKeys(tcData.get("lastname"));
		// click on save button
		driver.findElement(By.id("btnSave")).click();
		Reporter.log("Add Employee is completed with pass Status");

	}

	@AfterClass
	public void closeApplication() {
		driver.quit();
	}
}
