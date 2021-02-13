package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_By_Bank {
	
	private static WebDriver driver;
	
	@FindBy(xpath="//h1[text()='Please choose your payment method']")
	private static WebElement pay_by_bank_scroll;
	
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	private static WebElement pay_by_bank;

	public Payment_By_Bank(WebDriver driver2) {

	this.driver=driver2;
	PageFactory.initElements(driver, this);
	}

	public static WebElement getPay_by_bank_scroll() {
		return pay_by_bank_scroll;
	}

	public static WebElement getPay_by_bank() {
		return pay_by_bank;
	}
	
	
	

}
