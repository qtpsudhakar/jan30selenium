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

public class WC17OhrmAddEmployee_FileInputs_Robot {

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
		driver.findElement(By.id("firstName")).sendKeys("pawan");

		// enter last name
		driver.findElement(By.id("lastName")).sendKeys("kalyan");

		driver.findElement(By.xpath("//input[@id='photofile']")).click();

		//to store file path clip board
		String flPath = "C:\\Users\\envy\\Desktop\\Selenium_Jan30_Notes\\Data\\pk.jpg";
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(flPath), null);
		
		Thread.sleep(1000);
		//java robot class used to automate keyboard/mouse operations
		//we can able send keys on focused area
		
		Robot robo = new Robot();
		//press ctrl key
		robo.keyPress(KeyEvent.VK_CONTROL);
		//Continuously press v key
		robo.keyPress(KeyEvent.VK_V);
		//release ctrl
		robo.keyRelease(KeyEvent.VK_CONTROL);
		//release v
		robo.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(1000);
		//press and release enter key
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		// click on save button
		driver.findElement(By.id("btnSave")).click();
	}

}
