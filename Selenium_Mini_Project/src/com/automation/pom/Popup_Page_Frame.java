package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Popup_Page_Frame {
	
	private static WebDriver driver;
	
	@FindBy(xpath="//i[@class='icon-plus']")
	private static WebElement increment;
	
	@FindBy(xpath="//select[@name='group_1']")
	private static WebElement size;
	
	@FindBy(xpath="//a[@title='Pink']")
    private static WebElement colour;
	
	@FindBy(xpath="(//span[text()='Add to cart'])[1]")
	private static WebElement add_cart;

	public Popup_Page_Frame(WebDriver driver2) {

	this.driver=driver2;
	PageFactory.initElements(driver, this);
	}

	public static WebElement getIncrement() {
		return increment;
	}

	public static WebElement getSize() {
		return size;
	}

	public static WebElement getColour() {
		return colour;
	}

	public static WebElement getAdd_cart() {
		return add_cart;
	}
	
	
}
