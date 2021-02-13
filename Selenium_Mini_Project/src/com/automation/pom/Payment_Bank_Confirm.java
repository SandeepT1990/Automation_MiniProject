package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Payment_Bank_Confirm {
	
	private static WebDriver driver;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private static WebElement i_Confirm_Order;

	public Payment_Bank_Confirm(WebDriver driver2) {

	this.driver=driver2;
	PageFactory.initElements(driver, this);
	}

	public static WebElement getI_Confirm_Order() {
		return i_Confirm_Order;
	}
	

}
