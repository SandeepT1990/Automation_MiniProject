package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Purchase2_Women_Tab {
	
	private static WebDriver driver;
	
	@FindBy(xpath="//a[@title='Women']")
	private static WebElement Women_Tab_2;
	
	@FindBy(xpath="(//a[@title='T-shirts'])[1]")
	private static WebElement tshirt_Tab;

	public Purchase2_Women_Tab(WebDriver driver2) {

	this.driver=driver2;
	PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebElement getWomen_Tab_2() {
		return Women_Tab_2;
	}

	public static WebElement getTshirt_Tab() {
		return tshirt_Tab;
	}
	
	

}
