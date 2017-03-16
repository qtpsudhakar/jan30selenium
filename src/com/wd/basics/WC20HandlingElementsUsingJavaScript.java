package com.wd.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WC20HandlingElementsUsingJavaScript {

	public static void main(String[] args) throws InterruptedException {
		// JavascriptExecutor will be used to execute javascript

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

		JavascriptExecutor js = ((JavascriptExecutor) driver);

		// enter text on user name
		driver.findElement(By.id("txtUsername")).sendKeys("admin");

		// first argumet is java script
		// second argument is input also it s optional
		//

		// js.executeScript("document.getElementById('txtPassword').value='admin'");

		// js.executeScript("arguments[0].click();",driver.findElement(By.id("btnLogin")));

		// js.executeScript("arguments[0].value='admin';arguments[1].click();",driver.findElement(By.id("txtPassword")),driver.findElement(By.id("btnLogin")));

		// click on login button
		// driver.findElement(By.id("btnLogin")).click();

		WebElement elm = (WebElement) js
				.executeScript("return document.getElementById('txtPassword');");
		elm.sendKeys("admin");
		js.executeScript("arguments[0].style.border='5px dotted red'",driver.findElement(By.id("btnLogin")));
		
		Thread.sleep(3000);
		driver.findElement(By.id("btnLogin")).click();
	}
}
