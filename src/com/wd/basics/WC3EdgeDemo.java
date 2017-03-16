package com.wd.basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WC3EdgeDemo {

	public static void main(String[] args) {

		//configure web driver
		System.setProperty("webdriver.edge.driver",
				"F:\\SeleniumSoftware\\BrowserDrivers\\MicrosoftWebDriver.exe");
		
		// opens a new edge window
		EdgeDriver driver = new EdgeDriver();

		//navigate to google.com
		driver.get("http://google.com");
		
		//print page title
		System.out.println(driver.getTitle());
		
		//close the browser
		driver.quit();
	}

}




