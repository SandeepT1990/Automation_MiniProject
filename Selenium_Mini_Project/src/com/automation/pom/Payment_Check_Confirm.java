package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Check_Confirm {
	
	private static WebDriver driver;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private static WebElement iconfirm11;

	public Payment_Check_Confirm(WebDriver driver2) {

	this.driver=driver2;
	PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebElement getIconfirm11() {
		return iconfirm11;
	}
	

}
