package com.wd.basics;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WC21XPathTester {
	static WebDriver driver;

	public static void main(String[] args) {

		// configure browser driver
		System.setProperty("webdriver.edge.driver",
				"F:\\SeleniumSoftware\\BrowserDrivers\\MicrosoftWebDriver.exe");

		// opens new window
		driver = new EdgeDriver();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		// navigates to url
		driver.get("http://opensource.demo.orangehrmlive.com/");

		xpathTester(driver);

		// prints opened page title
		System.out.println(driver.getTitle());

		// close the browser
		// driver.quit();

	}

	public static void xpathTester(WebDriver driver) {

		// intialize scanner and javascript executor
		Scanner scn = new Scanner(System.in);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String elmFind = "y";

		while (elmFind.toLowerCase().equalsIgnoreCase("y")) {
			// ask for xpath
			System.out.println("give element xpath");
			String elmXpath = scn.next();

			// to find hidden element count
			int hiddenElm = 0;

			// get list of elements using the given xpath
			List<WebElement> lstElm = driver.findElements(By.xpath(elmXpath));

			// highlights all elements that are found with the given xpath
			for (int elmIndex = 0; elmIndex < lstElm.size(); elmIndex++) {
				js.executeScript("arguments[0].style.border='5px dotted red'",
						lstElm.get(elmIndex));

				// for counting hidden elements
				if (lstElm.get(elmIndex).isDisplayed()!=true) {
					hiddenElm++;
				}
			}

			// get the element count
			int nElm = lstElm.size();
			// print elements count
			System.out.println("Number of Elelemnts Found:" + nElm);

			// print hidden element count
			System.out.println("Number of Elelemnts Hidden:" + hiddenElm);
			System.out.println("See the highlighted elements in Application");

			// ask for test again
			System.out.println("Do you want to Test Again? \n Type 'y'");
			elmFind = scn.next();

			// if 'y' enetered reset highlighting
			if (elmFind.toLowerCase().equalsIgnoreCase("y")) {
				for (int elmIndex = 0; elmIndex < lstElm.size(); elmIndex++) {

					js.executeScript("arguments[0].style.border=''",
							lstElm.get(elmIndex));
				}
			}
		}
	}
}