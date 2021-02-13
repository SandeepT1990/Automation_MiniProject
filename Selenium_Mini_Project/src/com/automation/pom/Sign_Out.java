package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_Out {
	
	private static WebDriver driver;
	
	@FindBy(xpath = "//a[@class='logout']")
	private static WebElement sign_Out;

	public Sign_Out(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);
	
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebElement getSign_Out() {
		return sign_Out;
	}
	

}
