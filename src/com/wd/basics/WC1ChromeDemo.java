package com.wd.basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class WC1ChromeDemo {

	public static void main(String[] args) {

		//configure web driver
		System.setProperty("webdriver.chrome.driver",
				"F:\\SeleniumSoftware\\BrowserDrivers\\chromedriver.exe");
		
		// opens a new chrome window
		ChromeDriver driver = new ChromeDriver();

		//navigate to google.com
		driver.get("http://google.com");
		
		//print page title
		System.out.println(driver.getTitle());
		
		//close the browser
		driver.quit();
	}

}




