package com.wd.locators;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WC25OhrmAddEmployee_SeperateLocators_PropertiesFile {

	public static void main(String[] args) throws AWTException, InterruptedException, FileNotFoundException, IOException {
		
		//load properties
		Properties pr = new Properties();
		//pr.load(new FileInputStream("src\\com\\wd\\locators\\Ohrmloc.properties"));
		pr.load(new FileReader("src\\com\\wd\\locators\\Ohrmloc.properties"));
		
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

		System.out.println(pr.getProperty("appUrl"));
		// open url
		driver.get(pr.getProperty("appUrl"));

		// driver.navigate().to("http://opensource.demo.orangehrmlive.com/");

		// enter text on user name
		driver.findElement(getLoc(pr.getProperty("txtUserName"))).sendKeys("admin");

		// enter password on password field
		driver.findElement(getLoc(pr.getProperty("txtPassword"))).sendKeys("admin");

		// click on login button
		driver.findElement(getLoc(pr.getProperty("btnLogin"))).click();

		// click on PIM link
		driver.findElement(getLoc(pr.getProperty("lnkPIM"))).click();

		// click on add employee
		driver.findElement(getLoc(pr.getProperty("lnkAddEmployee"))).click();

		// enter first name
		driver.findElement(getLoc(pr.getProperty("txtFirstName"))).sendKeys("pawan");

		// enter last name
		driver.findElement(getLoc(pr.getProperty("txtLastNAme"))).sendKeys("kalyan");

		// click on save button
		driver.findElement(getLoc(pr.getProperty("btnSave"))).click();
	}
	public static By getLoc(String strLoc){
		String[] arrLoc = strLoc.split(";");
		
		switch(arrLoc[0].toLowerCase()){
		case "id":
			return By.id(arrLoc[1]);
		case "name":
			return By.name(arrLoc[1]);
		case "classname":
			return By.className(arrLoc[1]);
		case "tagname":
			return By.tagName(arrLoc[1]);
		case "linktext":
			return By.linkText(arrLoc[1]);
		case "partiallinktext":
			return By.partialLinkText(arrLoc[1]);				
		case "xpath":
			return By.xpath(arrLoc[1]);				
		case "cssselector":
			return By.cssSelector(arrLoc[1]);						
		}
		return null;
	}
}
