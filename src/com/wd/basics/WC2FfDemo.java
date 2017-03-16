package com.wd.basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WC2FfDemo {

	public static void main(String[] args) {

		//configure web driver
		System.setProperty("webdriver.gecko.driver",
				"F:\\SeleniumSoftware\\BrowserDrivers\\geckodriver.exe");
		
		// opens a new FF window
		FirefoxDriver driver = new FirefoxDriver();

		//navigate to google.com
		driver.get("http://google.com");
		
		//print page title
		System.out.println(driver.getTitle());
		
		//close the browser
		//driver.quit();
	}

}




