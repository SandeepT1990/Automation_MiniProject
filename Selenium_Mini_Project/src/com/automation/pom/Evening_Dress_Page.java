package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Evening_Dress_Page {
	
	
	public static WebDriver driver;
	
	@FindBy(xpath="//span[text()='Manufacturer']")
	private static WebElement manufacturer;
	
	@FindBy(xpath="//div[@class='right-block']")
	private static WebElement printed_Tab;
	
	@FindBy(xpath="//a[@class='quick-view']")
	private static WebElement quick_view;

	public Evening_Dress_Page(WebDriver driver2) {

	this.driver=driver2;
			PageFactory.initElements(driver,this);
	}

	public static WebElement getManufacturer() {
		return manufacturer;
	}

	public static WebElement getPrinted_Tab() {
		return printed_Tab;
	}

	public static WebElement getQuick_view() {
		return quick_view;
	}
	

}
