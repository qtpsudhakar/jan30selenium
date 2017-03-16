package com.wd.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WC7OhrmAddEmployee {

	public static void main(String[] args) {

		// configure driver
		System.setProperty("webdriver.chrome.driver",
				"F:\\SeleniumSoftware\\BrowserDrivers\\chromedriver.exe");
		// opens a new chrome window
		WebDriver driver = new ChromeDriver();

		//specify page load time
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		//specify element load
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//maximize window
		driver.manage().window().maximize();
		
		// open url
		driver.get("http://opensource.demo.orangehrmlive.com/");

		// driver.navigate().to("http://opensource.demo.orangehrmlive.com/");

		// enter text on user name
		driver.findElement(By.id("txtUsername")).sendKeys("admin");

		// enter password on password field
		driver.findElement(By.id("txtPassword")).sendKeys("admin");

		// click on login button
		driver.findElement(By.id("btnLogin")).click();

		// click on PIM link
		driver.findElement(By.linkText("PIM")).click();

		// click on add employee
		driver.findElement(By.linkText("Add Employee")).click();

		// enter first name
		driver.findElement(By.id("firstName")).sendKeys("selenium");

		// enter last name
		driver.findElement(By.id("lastName")).sendKeys("hq");

		// select checkbox
		if (driver.findElement(By.id("chkLogin")).isSelected() != true) {
			driver.findElement(By.id("chkLogin")).click();
		}

		//deselect checkbox
		if (driver.findElement(By.id("chkLogin")).isSelected()) {
			driver.findElement(By.id("chkLogin")).click();
		}
		//click on save button
		driver.findElement(By.id("btnSave")).click();
	}

}




