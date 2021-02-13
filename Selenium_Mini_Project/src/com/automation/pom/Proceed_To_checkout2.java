package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_To_checkout2 {
	
	private static WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
    private static WebElement Proceed_Kart2;

	public Proceed_To_checkout2(WebDriver driver2) {

	 this.driver=driver2;
			PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebElement getProceed_Kart2() {
		return Proceed_Kart2;
	}
	
}
