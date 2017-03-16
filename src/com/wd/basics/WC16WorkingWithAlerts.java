package com.wd.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WC16WorkingWithAlerts {

	public static void main(String[] args) throws InterruptedException {
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
		driver.get("https://landfill.bugzilla.org/bugzilla-5.0-branch/");

		driver.findElement(By.xpath("//input[@id='find_top']")).click();
		Thread.sleep(2000);

/*
 * Alert is generated by java script
 * alert usually have ok or cancel buttons
 * you cannot see any html code for alert
 * you can't right click on alert
 * 
 * Developers create some alerts in html aswell
 * we can inspect the html alerts
 * 
 * To handle javascript alerts we have to alert class
 * alert.accept will click on ok button
 * alert.dismis will close alert
 * alert.sendkeys will send text on alert box
 * 
 * You can handle html alerts using driver.findelement
 * 
 */
		
		Alert alert =  driver.switchTo().alert();
		//to close alert
		alert.dismiss();
		
		//to click on ok button of alert
		//alert.accept();
		
		//to send keys
		//alert.sendKeys("user input");
		
		driver.findElement(By.xpath("//input[@id='quicksearch_top']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@id='find_top']")).click();
	}

}






