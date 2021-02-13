package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_checkout_1 {
	
	private static WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	private static WebElement proceed1;

	public Proceed_checkout_1(WebDriver driver2) {

		this.driver= driver2;
		PageFactory.initElements(driver,this);
	
	}

	public static WebElement getProceed1() {
		return proceed1;
	}
	
	
	

}
