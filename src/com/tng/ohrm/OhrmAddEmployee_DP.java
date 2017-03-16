package com.tng.ohrm;

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

public class OhrmAddEmployee_DP {
	WebDriver driver;
	CommonMethods cm;
	
	@BeforeClass
	@Parameters({"browser","appUrl"})
	
	public void openApplication(String brName,String aUrl) {
		cm = new CommonMethods();
		driver = cm.OpenBrowser(driver, brName, aUrl);

	}

	@Test(priority=2,dataProviderClass=DataGeneratorTest.class,dataProvider="login")
	public void Login(String uname,String pwd) {
		// enter text on user name
		driver.findElement(By.id("txtUsername")).sendKeys(uname);

		// enter password on password field
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);

		// click on login button
		driver.findElement(By.id("btnLogin")).click();
		Reporter.log("Login is completed with pass Status");
	}

	@Test(priority=1,dependsOnMethods="Login",dataProviderClass=DataGeneratorTest.class,dataProvider="AddEmployee")
	public void AddEmployee(String fname,String lname) {
		// click on PIM link
		driver.findElement(By.linkText("PIM")).click();

		// click on add employee
		driver.findElement(By.linkText("Add Employee")).click();

		// enter first name
		driver.findElement(By.id("firstName")).sendKeys(fname);

		// enter last name
		driver.findElement(By.id("lastName")).sendKeys(lname);
		// click on save button
		driver.findElement(By.id("btnSave")).click();
		Reporter.log("Add Employee is completed with pass Status");

	}

	@AfterClass
	public void closeApplication() {
		driver.quit();
	}
}
