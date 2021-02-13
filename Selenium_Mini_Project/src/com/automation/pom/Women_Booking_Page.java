package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_Booking_Page {

	public static WebDriver driver;

	@FindBy(xpath = "//a[@title='Women']")
	private static WebElement women_tab;
	
	@FindBy(xpath = "(//a[@title='Evening Dresses'])[1]")
	private static WebElement evening_Tab;

	public Women_Booking_Page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver,this);
	}

	public WebElement getEvening_Tab() {
		return evening_Tab;
	}

	public WebElement getWomen_tab() {
		return women_tab;
	}

}
