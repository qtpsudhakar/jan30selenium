package com.wd.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WC12WorkingWithDuplicateElements {

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
		driver.get("http://demo.servicedeskplusmsp.com/");

		//findelements will get the list of elements
		List<WebElement>elmLst =  driver.findElements(By.xpath("//a[@class='loginadmin']"));
		//to click on first element
		elmLst.get(0).click();
	}

}





