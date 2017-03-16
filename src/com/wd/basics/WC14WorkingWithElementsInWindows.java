package com.wd.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WC14WorkingWithElementsInWindows {

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

		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']"))
				.click();

		// every window will have a handler value
		// handler value will be used to switch the window
		// to do operations on elements which are there different windows we
		// must switch to window

		// handler is unique and every time the window closes and opens a new
		// handler value will be created

		// store current window handler value
		String cWndHandle = driver.getWindowHandle();

		//call switch to window method
		switchToWindowByTitle(driver, "Sign Up | LinkedIn");

		//do operations on new window
		driver.findElement(By.id("first-name")).sendKeys("asdf");

		//close new window
		//close will close the current switched window
		//quit will close all windows that are opened in this execution session
		
		driver.close();
		
		//switch to main window(remember we already store main window handler value)
		driver.switchTo().window(cWndHandle);
		driver.findElement(By.id("txtUsername")).sendKeys("admin");

	}

	public static String switchToWindowByTitle(WebDriver driver, String wndTitle) {
		// get current opened window handles
		Set<String> strWndSet = driver.getWindowHandles();
		// loop through all windows and verify the window by title
		String wndStrHandle=null;
		for (String wnd : strWndSet) {
			
			driver.switchTo().window(wnd);
			if (driver.getTitle().equalsIgnoreCase(wndTitle)) {
				wndStrHandle = wnd;
				// once the title matche stop the for loop
				break;
			}
		}
		return wndStrHandle;
		
	}
}
