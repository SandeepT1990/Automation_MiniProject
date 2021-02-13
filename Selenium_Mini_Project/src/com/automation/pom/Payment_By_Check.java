package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_By_Check {
	
	private static WebDriver driver;
	
	@FindBy(xpath = "//a[@title='Pay by check.']")
	private static WebElement pay_By_Check;

	public Payment_By_Check(WebDriver driver2) {

	this.driver=driver2;
	
	PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebElement getPay_By_Check() {
		return pay_By_Check;
	}
	

}
