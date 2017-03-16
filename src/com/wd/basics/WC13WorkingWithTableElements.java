package com.wd.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WC13WorkingWithTableElements {

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
		driver.findElement(By.xpath("//*[@id='txtUsername']"))
				.sendKeys("admin");

		// enter password on password field
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin");

		// click on login button
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

		// click on PIM link
		driver.findElement(By.linkText("PIM")).click();

		// get data from table
		// getDataFromTable(driver, By.id("resultTable"));
		// System.out.println(getDataFromTableRowByCellText(driver,
		// By.id("resultTable"), 1, "0007"));
		HandleCheckBoxInTableRowByCellText(driver, By.id("resultTable"), 1,
				"0007", "ON");
		Thread.sleep(2000);
//		HandleCheckBoxInTableRowByCellText(driver, By.id("resultTable"), 1,			"0007", "OFF");
		// *[@id='resultTable']//td[2][.='0007']/..//input

		String tblXpath = "//*[@id='resultTable']//td[2][.='0007']/..//input";
		HandleCheckBoxInTableByCellText(driver, By.xpath(tblXpath), "ON");

	}

	public static void getDataFromTable(WebDriver driver, By tblLocator) {
		/*
		 * get data from table
		 */

		// get table element
		WebElement tblEmp = driver.findElement(tblLocator);

		// get rows from table
		List<WebElement> trLst = tblEmp.findElements(By.tagName("tr"));

		System.out.println(trLst.get(0).getText());
		for (int r = 0; r < trLst.size(); r++) {
			// get td elements from each table row
			List<WebElement> tdLst = trLst.get(r)
					.findElements(By.tagName("td"));
			if (tdLst.size() > 0) {
				// get data from td elements
				for (int c = 0; c < tdLst.size(); c++) {
					System.out.println(tdLst.get(c).getText());
				}

			}
		}

	}

	public static ArrayList<String> getDataFromTableRowByCellText(
			WebDriver driver, By tblLocator, int colIndex, String clTxt) {
		/*
		 * get data from table
		 */

		// get table element
		WebElement tblEmp = driver.findElement(tblLocator);

		// get rows from table
		List<WebElement> trLst = tblEmp.findElements(By.tagName("tr"));

		// create array list to store row data
		ArrayList<String> arrTblRow = new ArrayList<String>();

		// iterate through each table row using for loop
		for (int r = 0; r < trLst.size(); r++) {
			// get td elements from each table row
			List<WebElement> tdLst = trLst.get(r)
					.findElements(By.tagName("td"));
			// check count of td elements in side of tr
			if (tdLst.size() > 0) {
				// verify in which td the cell is available
				if (tdLst.get(colIndex).getText().equalsIgnoreCase(clTxt)) {
					// get data from td elements from identified row
					for (int c = 0; c < tdLst.size(); c++) {
						// store td element data in array list
						arrTblRow.add(tdLst.get(c).getText());
					}
					break;
				}
			}
		}
		return arrTblRow;
	}

	public static void HandleCheckBoxInTableRowByCellText(WebDriver driver,
			By tblLocator, int colIndex, String clTxt, String chkStatus) {
		/*
		 * get data from table
		 */

		// get table element
		WebElement tblEmp = driver.findElement(tblLocator);

		// get rows from table
		List<WebElement> trLst = tblEmp.findElements(By.tagName("tr"));

		// iterate through each table row using for loop
		for (int r = 0; r < trLst.size(); r++) {
			// get td elements from each table row
			List<WebElement> tdLst = trLst.get(r)
					.findElements(By.tagName("td"));
			// check count of td elements in side of tr
			if (tdLst.size() > 0) {
				// verify in which td the cell is available
				if (tdLst.get(colIndex).getText().equalsIgnoreCase(clTxt)) {

					WebElement chkElm = tdLst.get(colIndex - 1)
							.findElements(By.tagName("input")).get(0);
					if (chkStatus.equalsIgnoreCase("off")) {
						if (chkElm.isSelected()) {
							chkElm.click();
						}
					} else {
						if (chkElm.isSelected() != true) {
							chkElm.click();
						}
					}

					break;
				}
			}
		}
	}

	public static void HandleCheckBoxInTableByCellText(WebDriver driver,
			By tblLocator, String chkStatus) {

		WebElement chkElm = driver.findElement(tblLocator);
		if (chkStatus.equalsIgnoreCase("off")) {
			if (chkElm.isSelected()) {
				chkElm.click();
			}
		} else {
			if (chkElm.isSelected() != true) {
				chkElm.click();
			}
		}

	}
}
