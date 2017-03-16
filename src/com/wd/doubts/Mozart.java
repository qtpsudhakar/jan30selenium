package com.wd.doubts;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mozart {

	public static void main(String[] args) {

		// configure driver
		System.setProperty("webdriver.chrome.driver",
				"F:\\SeleniumSoftware\\BrowserDrivers\\chromedriver.exe");
		// opens a new chrome window
		WebDriver driver = new ChromeDriver();

		// open url
		driver.get("http://mozart-uat.iso.com");

		xpathTester(driver);
		System.out.println("completed");
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
				if (lstElm.get(elmIndex).isDisplayed()) {
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
