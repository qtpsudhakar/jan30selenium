package com.wd.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WC11WorkingWithListBox {

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
		driver.get("http://opensource.demo.orangehrmlive.com/");

		// driver.navigate().to("http://opensource.demo.orangehrmlive.com/");

		// enter text on user name
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("admin");

		// enter password on password field
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin");

		// click on login button
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

		// click on PIM link
		driver.findElement(By.linkText("PIM")).click();

		// click on add employee
		driver.findElement(By.linkText("Add Employee")).click();

		// enter first name
		driver.findElement(By.cssSelector("#firstName")).sendKeys("selenium");

		// enter last name
		driver.findElement(By.cssSelector("#lastName")).sendKeys("hq");
				
		// click on save button
		driver.findElement(By.id("btnSave")).click();

		// click on edit
		driver.findElement(By.id("btnSave")).click();

		// select indian from list box
		// new
		// Select(driver.findElement(By.id("personal_cmbNation"))).selectByVisibleText("Indian");
		WebElement elm = driver.findElement(By.id("personal_cmbNation"));
		new Select(elm).selectByVisibleText("Indian");
		
		//wait for 2 seconds
		Thread.sleep(2000);
		
		new Select(elm).selectByValue("77");
		Thread.sleep(2000);
		
		new Select(elm).selectByIndex(0);
		
		printListItems(driver, By.id("personal_cmbNation"));
		System.out.println(isListItemExist(driver, By.id("personal_cmbNation"), "indian"));
		System.out.println(isListItemExist(driver, By.id("personal_cmbNation"), "hyderabad"));
	}
	
	public static void printListItems(WebDriver driver,By xyz){

		WebElement elm = driver.findElement(xyz);
		List<WebElement> lstOptions = new Select(elm).getOptions();
		for(WebElement opt : lstOptions){
			System.out.println(opt.getText());
		}
	}

	public static boolean isListItemExist(WebDriver driver,By locator,String lstItemName){

		WebElement elm = driver.findElement(locator);
		List<WebElement> lstOptions = new Select(elm).getOptions();
		boolean isOptionExist=false;
		for(WebElement opt : lstOptions){
			if(opt.getText().equalsIgnoreCase(lstItemName)){
				isOptionExist = true;
				break;
			}
		}
		return isOptionExist;
	}
}





