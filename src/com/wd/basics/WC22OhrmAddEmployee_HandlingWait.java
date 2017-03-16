package com.wd.basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WC22OhrmAddEmployee_HandlingWait {

	public static void main(String[] args) throws AWTException, InterruptedException {

		/*
		 * implicit wait: not specific to single element
		 * 	it works for any page/element automatically
		 * 	pageload time, implicitly wait are example of implicit wait
		 * 
		 * explicit wait:
		 *  If we have to wait for an element/element attribute/alert/condition we use explicit wait
		 *  These waits are specific to that perticuler statement
		 * 
		 * Thread.sleep is provided by java and it is static
		 * 
		 * selenium doesnt give madatory wait. explicit and implicit both will have maximum and minimum timeout/condition
		 * 
		 * if explicit wait failed it throws an exception 
		 * 
		 */
		
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
		driver.get("http://opensource.demo.orangehrmlive.com/");

		// driver.navigate().to("http://opensource.demo.orangehrmlive.com/");

		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait for element
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txtUsername1")));
		wait.until(ExpectedConditions.attributeContains(By.id("txtUsername"), "name", "txt"));
		
		// enter text on user name		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");

		// enter password on password field
		driver.findElement(By.id("txtPassword")).sendKeys("admin");

		// click on login button
		driver.findElement(By.id("btnLogin")).click();

		// click on PIM link
		driver.findElement(By.linkText("PIM")).click();
	}

}
