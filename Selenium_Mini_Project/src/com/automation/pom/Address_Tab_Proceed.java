package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Tab_Proceed {
	
	private static WebDriver driver;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private static WebElement proceed_checkout3;

	public Address_Tab_Proceed(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public static WebElement getProceed_checkout3() {
		return proceed_checkout3;
	}
	
	

}
