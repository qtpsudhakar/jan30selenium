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

public class WC15WorkingWithElementsInFrames {

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
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//i[@class='icon-profile-new-unsigned']")).click();
		driver.findElement(By.xpath("//*[@id='signInLink']")).click();
		
		//a frame is to link a html document in other html documents
		// developers use it to reuse html code
		// iframe tag name will be used to crete frames
		// frame and frameset tag names are not supported in html5
		// the legacy application might have frame/frameset tags 
		
		// we can find the element is there in frame by right click -> verify frame related options
		// you can also observe the source code to find element is there in frame
		// you can use switchTo.Frame to do operations of elements in frames
		// You can switch to frame using id, element or index
		// Using element is the best method
		// If the frame is not having using attributes you can index
		// You can switch batch main html page using switchTo.defaultContent
		
		
		//switch frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
		
		driver.findElement(By.xpath("//button[text()='signup with email']")).click();
		
		//switch main html content
		driver.switchTo().defaultContent();
		
	}
}






