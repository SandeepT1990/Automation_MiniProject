package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Tab_Proceed2 {

	private static WebDriver driver;

	@FindBy(xpath = "//input[@type='checkbox']")
	private static WebElement checkBox111;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private static WebElement checkBox3111;

	public Shipping_Tab_Proceed2(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebElement getCheckBox111() {
		return checkBox111;
	}

	public static WebElement getCheckBox3111() {
		return checkBox3111;
	}

}
