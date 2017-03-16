package com.wd.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WC6OhrmLoginLogout {

	public static void main(String[] args) {

		// configure driver
		System.setProperty("webdriver.chrome.driver",
				"F:\\SeleniumSoftware\\BrowserDrivers\\chromedriver.exe");
		// opens a new chrome window
		WebDriver driver = new ChromeDriver();

		// open url
		driver.get("http://opensource.demo.orangehrmlive.com/");

		// driver.navigate().to("http://opensource.demo.orangehrmlive.com/");

		// enter text on user name
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		
		// enter password on password field
		driver.findElement(By.id("txtPassword")).sendKeys("admin");

		//click on login button
		driver.findElement(By.id("btnLogin")).click();
		
		
	}

}




