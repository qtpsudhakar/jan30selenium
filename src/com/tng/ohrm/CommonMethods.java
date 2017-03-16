package com.tng.ohrm;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethods {

	public static WebDriver OpenBrowser(WebDriver driver, String brName, String appUrl) {

		switch (brName) {
		case "chrome":
			// configure web driver
			System.setProperty("webdriver.chrome.driver",
					"F:\\SeleniumSoftware\\BrowserDrivers\\chromedriver.exe");

			// opens a new chrome window
			driver = new ChromeDriver();
			break;
		case "ff":
			// configure web driver
			System.setProperty("webdriver.gecko.driver",
					"F:\\SeleniumSoftware\\BrowserDrivers\\geckodriver.exe");

			// opens a new FF window
			driver = new FirefoxDriver();

			break;
		case "edge":
			// configure web driver
			System.setProperty("webdriver.edge.driver",
					"F:\\SeleniumSoftware\\BrowserDrivers\\MicrosoftWebDriver.exe");

			// opens a new edge window
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Invalid browser name");
			System.exit(0);
		}

		// specify page load time
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

		// specify element load
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// maximize window
		//driver.manage().window().maximize();

		// open url
		driver.get("http://opensource.demo.orangehrmlive.com/");		
		
		//assertEquals(driver.getTitle(), "OrangeHRM1");
		
		return driver;
	}
	
	public static HashMap<String, String> readDataFromTC(String flPath , String tcID) throws FileNotFoundException, IOException{
		//String flPath = "C:\\Users\\envy\\Desktop\\Selenium_Jan30_Notes\\Data\\Ohrm_Old.xls";
		
		// open work book
		HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream(flPath));				
		// get sheet
		HSSFSheet sht = wb.getSheet("Sheet1");		
		
		// get row count
		int rc = sht.getLastRowNum();
		
		HashMap<String, String> tcData = new HashMap<String, String>();
		for (int r = 1; r <= rc; r++) {
			int cc = sht.getRow(r).getLastCellNum();
			if (sht.getRow(r).getCell(0).toString()
					.equalsIgnoreCase(tcID)) {

				for (int c = 0; c < cc; c++) {
					String kName = sht.getRow(0).getCell(c).toString();
					String kVal = sht.getRow(r).getCell(c).toString();
					tcData.put(kName, kVal);
				}
				break;
			}
		}
		wb.close();
		return tcData;
	}
	
	//write a method to find element exist or not
	public boolean isElementExist(WebDriver driver,By locator){
		try{
			driver.findElement(locator);
			return true;
		}catch(NoSuchElementException nse){
			return false;
		}
		
	}
	
	public String getScreenShot(WebDriver driver){
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Date date = new Date() ;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;
		
		File dst =new File("src\\..\\ErrScr\\ss1"+dateFormat.format(date)+".png");
		try {
			FileUtils.copyFile(scr,dst );
			return dst.getAbsolutePath();
		} catch (IOException e) {
			System.out.println("file path not found");
			return null;
		}						
		
	}
	public String getUniqueCode(){
		Date date = new Date() ;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;
		
		return dateFormat.format(date);
	}
}







