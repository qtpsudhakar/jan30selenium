package com.wd.locators;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WC23OhrmAddEmployee_SeperateLocators {

	public static void main(String[] args) throws AWTException, InterruptedException {

		// configure driver
		System.setProperty("webdriver.chrome.driver",
				"F:\\SeleniumSoftware\\BrowserDrivers\\chromedriver.exe");
		// opens a new chrome window
		WebDriver driver = new ChromeDriver();

		// specify page load time
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

		// specify element load
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// maximize window
		driver.manage().window().maximize();

		// open url
		driver.get(OhrmLoc.appUrl);

		// driver.navigate().to("http://opensource.demo.orangehrmlive.com/");

		// enter text on user name
		driver.findElement(OhrmLoc.txtUserName).sendKeys("admin");

		// enter password on password field
		driver.findElement(OhrmLoc.txtPassword).sendKeys("admin");

		// click on login button
		driver.findElement(OhrmLoc.btnLogin).click();

		// click on PIM link
		driver.findElement(OhrmLoc.lnkPIM).click();

		// click on add employee
		driver.findElement(OhrmLoc.lnkAddEmployee).click();

		// enter first name
		driver.findElement(OhrmLoc.txtFirstName).sendKeys("pawan");

		// enter last name
		driver.findElement(OhrmLoc.txtLastNAme).sendKeys("kalyan");

		// click on save button
		driver.findElement(OhrmLoc.btnSave).click();
	}

}
