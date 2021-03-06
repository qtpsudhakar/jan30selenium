package com.wd.pof;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.files.handle.ReadData_Excel_POI;
import com.wd.locators.OhrmLoc;

public class OhrmPOFIntegrate {

	public static WebDriver driver;
	public LoginPagePOF loginPage;
	public WelcomePagePOF welcomePage;
	public AddEmployeePagePOF addEmpPage;
	public ReadData_Excel_POI readData;
	
	public void OpenApplication(String brName,String appURL) {

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
		driver.manage().window().maximize();

		// open url
		driver.get(appURL);

		initPageClasses();
	}

	public void initPageClasses(){
		loginPage = new LoginPagePOF(driver);
		welcomePage = new WelcomePagePOF(driver);
		addEmpPage = new AddEmployeePagePOF(driver);
		readData = new ReadData_Excel_POI();
	}
	
}







