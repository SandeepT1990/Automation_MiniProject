package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public static WebDriver driver;

	@FindBy(id = "email")
	private static WebElement email_address;

	@FindBy(id = "passwd")
	private static WebElement passwd;

	@FindBy(id = "SubmitLogin")
	private static WebElement signin;

	public Login_Page(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebElement getEmail_address() {
		return email_address;
	}

	public static WebElement getPasswd() {
		return passwd;
	}

	public static WebElement getSignin() {
		return signin;
	}

}
