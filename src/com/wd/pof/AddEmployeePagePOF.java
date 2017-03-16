package com.wd.pof;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePagePOF {

	public static WebDriver driver;

	public AddEmployeePagePOF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// identification methods

	@FindBy(id = "firstName")
	WebElement txtFirstName;
	@FindBy(id = "lastName")
	WebElement txtLastNAme;
	@FindBy(id = "btnSave")
	WebElement btnSave;

	public void enterTextOnFirstName(String val) {
		txtFirstName.sendKeys(val);
		System.out.println(val + " entered on firstname text box");
	}

	public void enterTextOnLastName(String val) {
		txtLastNAme.sendKeys(val);
		System.out.println(val + " entered on lastname text box");
	}

	public void clickOnSaveButton() {
		btnSave.click();
		System.out.println("clicked on save button");
	}
}
