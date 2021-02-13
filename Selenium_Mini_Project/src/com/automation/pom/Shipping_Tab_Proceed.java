package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Tab_Proceed {
	
	private static WebDriver driver;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private static WebElement checkbox;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private static WebElement proceed_Checkout_4;

	public Shipping_Tab_Proceed(WebDriver driver2) {

	this.driver=driver2;
	PageFactory.initElements(driver, this);
	}

	public static WebElement getCheckbox() {
		return checkbox;
	}

	public static WebElement getProceed_Checkout_4() {
		return proceed_Checkout_4;
	}
	
	

}
