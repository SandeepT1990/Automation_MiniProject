package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TakeScreenShot_1 {
	private static WebDriver driver;

	@FindBy(xpath = "//li[@class='step_current last']")
	private static WebElement scroll_payment;

	public TakeScreenShot_1(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public static WebElement getScroll_payment() {
		return scroll_payment;
	}

}
