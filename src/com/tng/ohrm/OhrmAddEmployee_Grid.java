package com.tng.ohrm;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OhrmAddEmployee_Grid {
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser","appUrl","nodeUrl"})
	
	public void openApplication(String brName,String aUrl,String nUrl) throws MalformedURLException {
		switch (brName) {
		case "chrome":

			// opens a new chrome window
			driver = new RemoteWebDriver(new URL(nUrl), DesiredCapabilities.chrome());
			break;
		case "ff":
			driver = new RemoteWebDriver(new URL(nUrl), DesiredCapabilities.firefox());

			break;
		case "edge":
			driver = new RemoteWebDriver(new URL(nUrl), DesiredCapabilities.edge());
			break;
		default:
			System.out.println("Invalid browser name");
			System.exit(0);
		}

		// specify page load time
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

		// specify element load
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// maximize window
		driver.manage().window().maximize();

		// open url
		driver.get("http://opensource.demo.orangehrmlive.com/");

	}

	@Test(priority=2,groups="smoke")
	public void Login() {
		// enter text on user name
		driver.findElement(By.id("txtUsername")).sendKeys("admin");

		// enter password on password field
		driver.findElement(By.id("txtPassword")).sendKeys("admin");

		// click on login button
		driver.findElement(By.id("btnLogin")).click();
		Reporter.log("Login is completed with pass Status");
	}

	@Test(priority=1,dependsOnMethods="Login")
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
