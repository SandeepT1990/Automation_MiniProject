package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirt_Page {
	
	private static WebDriver driver;
	
	@FindBy(xpath="//span[@id='layered_price_range']")
	private static WebElement scroll_Range;
	
	@FindBy(xpath="//div[@class='right-block']")
	private static WebElement quick_View2;
	
	@FindBy(xpath="//a[@class='quick-view']")
	private static WebElement quick_View3;

	public Tshirt_Page(WebDriver driver2) {

	this.driver=driver2;
	PageFactory.initElements(driver, this);
	
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebElement getScroll_Range() {
		return scroll_Range;
	}

	public static WebElement getQuick_View2() {
		return quick_View2;
	}

	public static WebElement getQuick_View3() {
		return quick_View3;
	}
	
	
	

}
