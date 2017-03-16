package com.wd.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WC9OhrmAddAndEditEmployeeWithMethods {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WC9OhrmAddAndEditEmployeeWithMethods ohrm = new WC9OhrmAddAndEditEmployeeWithMethods();
		ohrm.openApplication("chrome", "http://opensource.demo.orangehrmlive.com/");
		ohrm.login();
		ohrm.addAndEditEmployee();
		
	}

	// write a method to open any browser depends on input
	public void openApplication(String brName, String appUrl) {

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
		driver.get("http://opensource.demo.orangehrmlive.com/");

		// driver.navigate().to("http://opensource.demo.orangehrmlive.com/");

	}

	public void login() {
		// enter text on user name
		driver.findElement(By.id("txtUsername")).sendKeys("admin");

		// enter password on password field
		driver.findElement(By.id("txtPassword")).sendKeys("admin");

		// click on login button
		driver.findElement(By.id("btnLogin")).click();

	}

	public void addAndEditEmployee() {
		// click on PIM link
		driver.findElement(By.linkText("PIM")).click();

		// click on add employee
		driver.findElement(By.linkText("Add Employee")).click();

		// enter first name
		driver.findElement(By.id("firstName")).sendKeys("selenium");

		// enter last name
		driver.findElement(By.id("lastName")).sendKeys("hq");

		// select checkbox
		if (driver.findElement(By.id("chkLogin")).isSelected() != true) {
			driver.findElement(By.id("chkLogin")).click();
		}

		// deselect checkbox
		if (driver.findElement(By.id("chkLogin")).isSelected()) {
			driver.findElement(By.id("chkLogin")).click();
		}
		// click on save button
		driver.findElement(By.id("btnSave")).click();

		// click on edit
		driver.findElement(By.id("btnSave")).click();

		// select female radio
		driver.findElement(By.id("personal_optGender_2")).click();

		// select indian from list box
		// new
		// Select(driver.findElement(By.id("personal_cmbNation"))).selectByVisibleText("Indian");
		WebElement elm = driver.findElement(By.id("personal_cmbNation"));
		Select cmbNation = new Select(elm);
		cmbNation.selectByVisibleText("Indian");

	}
}
