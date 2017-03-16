package com.tng.ohrm;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class OhrmAddEmployee_ExtentReports {

	/*
	 * configure extent reports download 2.41.2 version from
	 * https://drive.google.com/file/d/0ByJmgAhaLx0GVzktVFNNUEZPeWc/view Extract
	 * zip file and associate all jar files from all folders
	 * 
	 * initialize extentreport with a html file create test instance log use
	 * test instance to log every time
	 */
	WebDriver driver;
	ExtentReports exReport;
	ExtentTest test;

	@BeforeClass
	public void openApplication() throws IOException {

		exReport = new ExtentReports("src\\..\\Reports\\OhrmAddEmp2.html");
		test = exReport.startTest("ohrmAddEmp");

		// configure web driver
		System.setProperty("webdriver.gecko.driver",
				"F:\\SeleniumSoftware\\BrowserDrivers\\geckodriver.exe");

		driver = new FirefoxDriver();

		// specify page load time
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

		// specify element load
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// maximize window
		driver.manage().window().maximize();

		try {

			// open url
			driver.get("http://opensource.demo.orangehrmlive.com/");

			assertEquals(driver.getTitle(), "OrangeHRM1");
						
			test.log(
					LogStatus.PASS,
					"OpenApplication",
					"Orange hrm Application opened. Title is: "
							+ driver.getTitle());

		} catch (AssertionError ase) {
			
			File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Date date = new Date() ;
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;
			
			File dst =new File("src\\..\\ErrScr\\ss1"+dateFormat.format(date)+".png");
			
			FileUtils.copyFile(scr,dst );						
			System.out.println(dst.getAbsolutePath());
			test.log(LogStatus.FAIL, "screen capture"+test.addScreenCapture(dst.getAbsolutePath()));
			
			test.log(LogStatus.FAIL, "OpenApplication",
					"Failed to open application");

			exReport.endTest(test);

			exReport.flush();
			Assert.fail("got failure because of verification");
		}
	}

	@Test(priority = 2, groups = "smoke")
	public void Login() {

		try {

			// enter text on user name
			driver.findElement(By.id("txtUsername")).sendKeys("admin");

			// enter password on password field
			driver.findElement(By.id("txtPassword")).sendKeys("admin");

			// click on login button
			driver.findElement(By.id("btnLogin")).click();

			test.log(LogStatus.PASS, "Login", "Login functionality is passed");
		} catch (NoSuchElementException nse) {
			test.log(LogStatus.FAIL, "Login",
					"Login functionality is failed because an element not found"
							+ nse.getMessage());
			Assert.fail("Login functionality is failed because an element not found");
		}
		

	}

	@Test(priority = 1, dependsOnMethods = "Login")
	public void AddEmployee() {

		try {

			// click on PIM link
			driver.findElement(By.linkText("PIM")).click();

			// click on add employee
			driver.findElement(By.linkText("Add Employee")).click();

			// enter first name
			driver.findElement(By.id("firstName")).sendKeys("selenium");

			// enter last name
			driver.findElement(By.id("lastName")).sendKeys("hq");
			// click on save button
			driver.findElement(By.id("btnSave")).click();
			test.log(LogStatus.PASS, "AddEmployee", "AddEmployee functionality is passed");
		} catch (NoSuchElementException nse) {
			test.log(LogStatus.FAIL, "AddEmployee",
					"AddEmployee functionality is failed because an element not found"
							+ nse.getMessage());
			Assert.fail("AddEmployee functionality is failed because an element not found");
		}catch(ElementNotVisibleException ev){
			test.log(LogStatus.FAIL, "AddEmployee",
					"AddEmployee functionality is failed because an element not visible"
							+ ev.getMessage());
			Assert.fail("AddEmployee functionality is failed because an element not visible");
		}

	}

	@AfterClass
	public void closeApplication() {
		driver.quit();
		exReport.endTest(test);
		exReport.flush();
	}
}
