package com.tng.ohrm;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OhrmAddEmployee_WithoutXML {
	WebDriver driver;

	@BeforeClass
	public void openApplication() {

		// configure web driver
		System.setProperty("webdriver.chrome.driver",
				"F:\\SeleniumSoftware\\BrowserDrivers\\chromedriver.exe");

		driver = new ChromeDriver();
		
		// specify page load time
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

		// specify element load
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// maximize window
		//driver.manage().window().maximize();

		try{
			
		
		// open url
		driver.get("http://opensource.demo.orangehrmlive.com/");
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(driver.getTitle(), "OrangeHRM1");
		
		sa.assertEquals(driver.getTitle(), "OrangeHRM2");
		
		sa.assertEquals(driver.getTitle(), "OrangeHRM5");
		
		
		sa.assertAll();
		
		assertEquals(driver.getTitle(), "OrangeHRM123");	
		
		System.out.println(driver.getTitle());
		}
		catch(AssertionError ase){
			System.out.println("got failure because of verification");
			//Assert.fail("got failure because of verification");
			throw new NoSuchElementException("Element not found");
		}
	}

	
	
	
	@Test(priority = 2, groups = "smoke")
	public void Login() {
		// enter text on user name
		driver.findElement(By.id("txtUsername")).sendKeys("admin");

		// enter password on password field
		driver.findElement(By.id("txtPassword")).sendKeys("admin");

		// click on login button
		driver.findElement(By.id("btnLogin")).click();
		Reporter.log("Login is completed with pass Status");
	}

	@Test(priority = 1, dependsOnMethods = "Login")
	public void AddEmployee() {
		// click on PIM link
		driver.findElement(By.linkText("PIM")).click();

		// click on add employee
		driver.findElement(By.linkText("Add Employee")).click();

		// enter first name
		driver.findElement(By.id("firstName")).sendKeys("selenium");

		// enter last name
		driver.findElement(By.id("lastName")).sendKeys("hq");
		// click on save button
		driver.findElement(By.id("btnSave")).click();
		Reporter.log("Add Employee is completed with pass Status");

	}

	@AfterClass
	public void closeApplication() {
		driver.quit();
	}
}
