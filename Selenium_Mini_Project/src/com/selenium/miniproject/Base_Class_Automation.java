package com.selenium.miniproject;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class_Automation extends Base_Class {

	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		driver = getBrowser("chrome");

		getUrl("http://automationpractice.com/index.php");

		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement login = driver.findElement(By.xpath("//a[@class='login']"));

		clickOnElement(login);

		WebElement email_address = driver.findElement(By.id("email"));

		inputValueElement(email_address, "abc123@gmail.com");

		WebElement passwd = driver.findElement(By.id("passwd"));

		inputValueElement(passwd, "Password@123");

		WebElement signin = driver.findElement(By.id("SubmitLogin"));

		clickOnElement(signin);

		Thread.sleep(3000);

		WebElement women_Tab = driver.findElement(By.xpath("//a[@title='Women']"));

		Actions(women_Tab, "moveToElement");

		WebElement evening_Dress = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[1]"));

		Actions(evening_Dress, "moveToElement");

		clickOnElement(evening_Dress);

		Thread.sleep(3000);

		WebElement manufacturer = driver.findElement(By.xpath("//span[text()='Manufacturer']"));

		scroll(manufacturer);

		WebElement printed_Tab = driver.findElement(By.xpath("//div[@class='right-block']"));

		Actions(printed_Tab, "moveToElement");

		WebElement quick_View_Tab = driver.findElement(By.xpath("//a[@class='quick-view']"));

		Actions(quick_View_Tab, "moveToElement");

		clickOnElement(quick_View_Tab);

		driver.switchTo().frame(0);

		WebElement increment = driver.findElement(By.xpath("//i[@class='icon-plus']"));

		clickOnElement(increment);

		WebElement size = driver.findElement(By.xpath("//select[@name='group_1']"));

		singleDropDown(size, "value", "2");

		WebElement colour = driver.findElement(By.xpath("//a[@title='Pink']"));

		clickOnElement(colour);

		WebElement add_Cart = driver.findElement(By.xpath("(//span[text()='Add to cart'])[1]"));

		clickOnElement(add_Cart);

		Thread.sleep(3000);

		WebElement proceed = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));

		clickOnElement(proceed);

		Thread.sleep(3000);

		WebElement proceed_Checkout = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));

		clickOnElement(proceed_Checkout);

		WebElement proceed_checkout2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));

		clickOnElement(proceed_checkout2);

		Thread.sleep(3000);

		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));

		clickOnElement(checkBox);

		WebElement proceed_Checkout3 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));

		clickOnElement(proceed_Checkout3);

		WebElement pay_By_Bank = driver.findElement(By.xpath("//h1[text()='Please choose your payment method']"));

		scroll(pay_By_Bank);

		WebElement payby_Bank1 = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));

		clickOnElement(payby_Bank1);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement i_Confirm_Order = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));

		clickOnElement(i_Confirm_Order);

		implicitWait(30, TimeUnit.SECONDS);

		WebElement scroll_payment = driver.findElement(By.xpath("//li[@class='step_current last']"));

		scroll(scroll_payment);

		Thread.sleep(2000);

		TakesScreenshots("C:\\Users\\Sande_000\\Desktop\\java\\Selenium_Mini_Project\\Screenshots\\snapper"
				+ System.currentTimeMillis() + "snap1.png");

		Thread.sleep(2000);

		WebElement WomenTab_11 = driver.findElement(By.xpath("//a[@title='Women']"));

		Actions(WomenTab_11, "moveToElement");

		WebElement t_shirt11 = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));

		clickOnElement(t_shirt11);

		WebElement scroll_range = driver.findElement(By.xpath("//span[@id='layered_price_range']"));

		scroll(scroll_range);

		WebElement quick_View2 = driver.findElement(By.xpath("//div[@class='right-block']"));

		Actions(quick_View2, "moveToElement");

		WebElement quickview_3 = driver.findElement(By.xpath("//a[@class='quick-view']"));

		Actions(quickview_3, "moveToElement");

		clickOnElement(quickview_3);

		driver.switchTo().frame(0);

		WebElement add_Btn1 = driver
				.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));

		clickOnElement(add_Btn1);

		WebElement select_Medium = driver.findElement(By.xpath("//select[@id='group_1']"));

		singleDropDown(select_Medium, "value", "2");

		WebElement colour_dress1 = driver.findElement(By.id("color_14"));

		clickOnElement(colour_dress1);

		WebElement cart1 = driver.findElement(By.xpath("//button[@name='Submit']"));

		clickOnElement(cart1);

		Thread.sleep(3000);

		WebElement proced_kart = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));

		clickOnElement(proced_kart);
		///

		WebElement proceed_Checkout123 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));

		clickOnElement(proceed_Checkout123);

		WebElement proceed_checkout211 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));

		clickOnElement(proceed_checkout211);

		Thread.sleep(3000);

		WebElement checkBox111 = driver.findElement(By.xpath("//input[@type='checkbox']"));

		clickOnElement(checkBox111);

		WebElement proceed_Checkout3111 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));

		clickOnElement(proceed_Checkout3111);

		WebElement pay_By_Cheque = driver.findElement(By.xpath("//a[@title='Pay by check.']"));

		clickOnElement(pay_By_Cheque);

		WebElement iConfirm11 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));

		clickOnElement(iConfirm11);
		// WebElement scroll_payment1 = driver.findElement(By.id("step_end"));

		// js.executeScript("arguments[0].scrollIntoView();", scroll_payment1);

		WebElement sign_Out = driver.findElement(By.xpath("//a[@class='logout']"));

		clickOnElement(sign_Out);

		quit();

	}

}
