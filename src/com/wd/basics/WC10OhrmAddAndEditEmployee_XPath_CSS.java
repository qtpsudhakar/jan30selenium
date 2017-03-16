package com.wd.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WC10OhrmAddAndEditEmployee_XPath_CSS {

	public static void main(String[] args) {

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
		driver.findElement(By.xpath("//input[@id='uname']")).sendKeys("123");;
		

		// select checkbox
		if (driver.findElement(By.id("chkLogin")).isSelected() != true) {
			driver.findElement(By.id("chkLogin")).click();
		}

		// deselect checkbox
		if (driver.findElement(By.id("chkLogin")).isSelected()) {
			driver.findElement(By.id("chkLogin")).click();
		}
		// click on save button
		driver.findElement(By.id("btnSave")).click();

		// click on edit
		driver.findElement(By.id("btnSave")).click();

		// select female radio
		driver.findElement(By.id("personal_optGender_2")).click();

		// select indian from list box
		// new
		// Select(driver.findElement(By.id("personal_cmbNation"))).selectByVisibleText("Indian");
		WebElement elm = driver.findElement(By.id("personal_cmbNation"));
		Select cmbNation = new Select(elm);
		cmbNation.selectByVisibleText("Indian");

	}

}
