package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shopping_Cart_Summary2 {
	
	private static WebDriver driver;
	
	
	
	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private static WebElement checkout_123;
	



	public Shopping_Cart_Summary2(WebDriver driver2) {

	this.driver=driver2;
	PageFactory.initElements(driver, this);
	}



	public static WebDriver getDriver() {
		return driver;
	}



	public static WebElement getCheckout_123() {
		return checkout_123;
	}
	
	
	
	

}
