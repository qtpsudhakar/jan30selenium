package com.wd.pof;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.wd.locators.OhrmLoc;

public class OhrmAddEmp {

	public static void main(String[] args) {
		
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

		LoginPagePOF loginPage = new LoginPagePOF(driver);
		loginPage.enterTextOnUserName("admin");
		loginPage.enterTextOnPassword("admin");
		loginPage.clickOnLoginButton();
		
		WelcomePagePOF welcomePage = new WelcomePagePOF(driver);
		welcomePage.clickOnPIMLink();
		welcomePage.clickOnAddEmployeeLink();
		
		AddEmployeePagePOF addEmpPage = new AddEmployeePagePOF(driver);
		addEmpPage.enterTextOnFirstName("sudhakar");
		addEmpPage.enterTextOnLastName("k");
		addEmpPage.clickOnSaveButton();

	}

}






