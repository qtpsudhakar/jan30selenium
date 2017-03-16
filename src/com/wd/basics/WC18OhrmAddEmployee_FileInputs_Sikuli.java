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
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class WC18OhrmAddEmployee_FileInputs_Sikuli {

	public static void main(String[] args) throws AWTException,
			InterruptedException, FindFailed {

		/*configure sikuli
		 * 
		 * goto http://sikulix.com/
		 * click on Get version 1.1.0
		 * In opened page  click on sikulixsetup-1.1.0.jar 
		 * save jar file in a new folder
		 * double click on jar file
		 * select second option 
		 * click on setup now
		 * click on yes button until you see a message "have fun"
		 * observe that in the same a new jar file create with name sikulixapi.jar
		 * add sikulixapi.jar to build path 
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

		// click on PIM link
		driver.findElement(By.linkText("PIM")).click();

		// click on add employee
		driver.findElement(By.linkText("Add Employee")).click();

		// enter first name
		driver.findElement(By.id("firstName")).sendKeys("pawan");

		// enter last name
		driver.findElement(By.id("lastName")).sendKeys("kalyan");

		driver.findElement(By.xpath("//input[@id='photofile']")).click();

		// to store file path clip board
		String flPath = "C:\\Users\\envy\\Desktop\\Selenium_Jan30_Notes\\Data\\pk.jpg";
		
		Screen scr = new Screen();
		scr.type("C:\\Users\\envy\\Desktop\\Selenium_Jan30_Notes\\ElmImg\\txtFileName.JPG", flPath);
		scr.click("C:\\Users\\envy\\Desktop\\Selenium_Jan30_Notes\\ElmImg\\btnOpen.JPG");
		
		
		// click on save button
		driver.findElement(By.id("btnSave")).click();
	}

}
