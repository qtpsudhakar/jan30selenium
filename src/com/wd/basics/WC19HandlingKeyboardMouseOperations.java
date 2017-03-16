package com.wd.basics;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WC19HandlingKeyboardMouseOperations {

	public static void main(String[] args) throws InterruptedException {
		/* 
		 * click
		 * double click
		 * right click
		 * scroll
		 * drag and drop
		 * mouse hover
		 * 
		 * sendkeys
		 * 
		 * Actions class will be used to perform mouse related operations
		 * we can also use robot class to do mouse operations
		 * 
		 * Robot class is not specific to html window
		 * you can work with the screen aswell
		 * 
		 * Actions class will take driver as input
		 * So it works with only the provided driver window
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

		// enter text on user name
		driver.findElement(By.id("txtUsername")).sendKeys("admin");

		// enter password on password field
		driver.findElement(By.id("txtPassword")).sendKeys("admin");

		// click on login button
		driver.findElement(By.id("btnLogin")).click();

		
		/*
		 * Mouse hover
		 * use moveToElement for mouse hover and also for scroll to element
		 * it is suggested to keep some static wait before mouse/keyboard operations
		 */
		
		WebElement elm = driver.findElement(By.linkText("PIM"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		
		act.moveToElement(elm).build().perform();

		// click on add employee
		driver.findElement(By.linkText("Add Employee")).click();

		/*
		 * send normal text
		 * send keyboard keys
		 */
		Thread.sleep(1000);
		// enter first name
		WebElement elmFName = driver.findElement(By.id("firstName"));		
		act.sendKeys(elmFName,"pawan").build().perform();
		
		Thread.sleep(1000);
		
		WebElement elmLName = driver.findElement(By.id("lastName"));
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection("kalyan"), null);
		act.sendKeys(elmLName, Keys.CONTROL+"v").build().perform();

		/*
		 * double click 
		 * contextclick for right click 
		 */
		Thread.sleep(1000);
		act.doubleClick(elmLName).build().perform();
		Thread.sleep(1000);
		act.contextClick(elmLName).build().perform();
		
		/*
		 * drag drop
		 */
		driver.navigate().to("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		WebElement elmFrom = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement elmTo = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		act.dragAndDrop(elmFrom, elmTo).build().perform();
		
		driver.switchTo().defaultContent();
	}

}





