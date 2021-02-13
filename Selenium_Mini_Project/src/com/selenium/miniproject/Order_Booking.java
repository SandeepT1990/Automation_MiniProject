package com.selenium.miniproject;

import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.swing.Icon;

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

public class Order_Booking {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement login = driver.findElement(By.xpath("//a[@class='login']"));

		login.click();

		WebElement email_address = driver.findElement(By.id("email"));

		email_address.sendKeys("abc123@gmail.com");

		WebElement passwd = driver.findElement(By.id("passwd"));

		passwd.sendKeys("Password@123");

		WebElement signin = driver.findElement(By.id("SubmitLogin"));

		signin.click();

		Thread.sleep(3000);

		WebElement women_Tab = driver.findElement(By.xpath("//a[@title='Women']"));

		Actions a = new Actions(driver);

		a.moveToElement(women_Tab).build().perform();

		WebElement evening_Dress = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[1]"));

		a.moveToElement(evening_Dress).build().perform();

		evening_Dress.click();

		Thread.sleep(3000);

		WebElement manufacturer = driver.findElement(By.xpath("//span[text()='Manufacturer']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", manufacturer);

		WebElement printed_Tab = driver.findElement(By.xpath("//div[@class='right-block']"));

		a.moveToElement(printed_Tab).build().perform();

		WebElement quick_View_Tab = driver.findElement(By.xpath("//a[@class='quick-view']"));

		a.moveToElement(quick_View_Tab).build().perform();

		quick_View_Tab.click();

		driver.switchTo().frame(0);

		WebElement increment = driver.findElement(By.xpath("//i[@class='icon-plus']"));

		increment.click();

		WebElement size = driver.findElement(By.xpath("//select[@name='group_1']"));

		Select s = new Select(size);

		s.selectByValue("2");

		WebElement colour = driver.findElement(By.xpath("//a[@title='Pink']"));

		colour.click();

		WebElement add_Cart = driver.findElement(By.xpath("(//span[text()='Add to cart'])[1]"));

		add_Cart.click();

		Thread.sleep(3000);

		WebElement proceed = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));

		proceed.click();

		Thread.sleep(3000);

		WebElement proceed_Checkout = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));

		proceed_Checkout.click();

		WebElement proceed_checkout2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));

		proceed_checkout2.click();

		Thread.sleep(3000);

		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));

		checkBox.click();

		WebElement proceed_Checkout3 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));

		proceed_Checkout3.click();

		WebElement pay_By_Bank = driver.findElement(By.xpath("//h1[text()='Please choose your payment method']"));

		js.executeScript("arguments[0].scrollIntoView();", pay_By_Bank);

		WebElement payby_Bank1 = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));

		payby_Bank1.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement i_Confirm_Order = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));

		i_Confirm_Order.click();

		WebElement scroll_payment = driver.findElement(By.xpath("//li[@class='step_current last']"));

		js.executeScript("arguments[0].scrollIntoView();", scroll_payment);

		Thread.sleep(2000);

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File destination = new File("C:\\Users\\Sande_000\\Desktop\\java\\Selenium_Mini_Project\\Screenshots\\snapper"
				+ System.currentTimeMillis() + ".png");

		FileUtils.copyFile(source, destination);

		Thread.sleep(2000);

		// WebElement continue_Shopping =
		// driver.findElement(By.xpath("//a[@title='Previous']"));

		// continue_Shopping.click();

		WebElement WomenTab_11 = driver.findElement(By.xpath("//a[@title='Women']"));

		Actions a2 = new Actions(driver);

		a2.moveToElement(WomenTab_11).build().perform();

		WebElement t_shirt11 = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));

		t_shirt11.click();

		WebElement scroll_range = driver.findElement(By.xpath("//span[@id='layered_price_range']"));

		js.executeScript("arguments[0].scrollIntoView();", scroll_range);

		WebElement quick_View2 = driver.findElement(By.xpath("//div[@class='right-block']"));

		Actions a3 = new Actions(driver);

		a3.moveToElement(quick_View2).build().perform();

		WebElement quickview_3 = driver.findElement(By.xpath("//a[@class='quick-view']"));

		a3.moveToElement(quickview_3).build().perform();

		quickview_3.click();

		driver.switchTo().frame(0);

		WebElement add_Btn1 = driver
				.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));

		add_Btn1.click();

		WebElement select_Medium = driver.findElement(By.xpath("//select[@id='group_1']"));

		Select s4 = new Select(select_Medium);

		s4.selectByValue("2");

		WebElement colour_dress1 = driver.findElement(By.id("color_14"));
		colour_dress1.click();

		WebElement cart1 = driver.findElement(By.xpath("//button[@name='Submit']"));

		cart1.click();

		Thread.sleep(3000);

		WebElement proced_kart = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));

		proced_kart.click();

		///

		WebElement proceed_Checkout123 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));

		proceed_Checkout123.click();

		WebElement proceed_checkout211 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));

		proceed_checkout211.click();

		Thread.sleep(3000);

		WebElement checkBox111 = driver.findElement(By.xpath("//input[@type='checkbox']"));

		checkBox111.click();

		WebElement proceed_Checkout3111 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));

		proceed_Checkout3111.click();

		WebElement pay_By_Cheque = driver.findElement(By.xpath("//a[@title='Pay by check.']"));

		pay_By_Cheque.click();

		WebElement iConfirm11 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));

		iConfirm11.click();

	//WebElement scroll_payment1 = driver.findElement(By.id("step_end"));

		//js.executeScript("arguments[0].scrollIntoView();", scroll_payment1);
		
		
		WebElement sign_Out = driver.findElement(By.xpath("//a[@class='logout']"));
		
		
		sign_Out.click();
		
		driver.quit();

	}

}
