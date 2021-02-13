package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Popup_Page_Frame2 {
	
	private static WebDriver driver;
	
	@FindBy(xpath="//a[@class='btn btn-default button-plus product_quantity_up']")
	private static WebElement add_Btn1;
	
	@FindBy(xpath="//select[@id='group_1']")
	private static WebElement select_Medium1;
	
	@FindBy(id="color_14")
	private static WebElement colour_dress1;
	
	@FindBy(xpath="//button[@name='Submit']")
	private static WebElement cart1;

	public Popup_Page_Frame2(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);
	
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebElement getAdd_Btn1() {
		return add_Btn1;
	}

	public static WebElement getSelect_Medium1() {
		return select_Medium1;
	}

	public static WebElement getColour_dress1() {
		return colour_dress1;
	}

	public static WebElement getCart1() {
		return cart1;
	}
	
	

}
