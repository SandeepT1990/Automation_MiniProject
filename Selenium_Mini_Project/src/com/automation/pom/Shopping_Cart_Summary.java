package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shopping_Cart_Summary {
	
	private static WebDriver driver;
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private static WebElement proceed_to_checkout2;
	

	public Shopping_Cart_Summary(WebDriver driver2) {

	this.driver=driver2;
	PageFactory.initElements(driver, this);
	}


	public static WebElement getProceed_to_checkout2() {
		return proceed_to_checkout2;
	}
	
	

}
