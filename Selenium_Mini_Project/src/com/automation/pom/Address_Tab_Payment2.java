package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Tab_Payment2 {

	
	private static WebDriver driver;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private static WebElement proceed_Checkout_211;

	public Address_Tab_Payment2(WebDriver driver2) {

	
		this.driver=driver2;
		PageFactory.initElements(driver, this);
				
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebElement getProceed_Checkout_211() {
		return proceed_Checkout_211;
	}
	
	
}
