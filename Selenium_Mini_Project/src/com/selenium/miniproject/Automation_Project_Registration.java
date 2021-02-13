package com.selenium.miniproject;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automation_Project_Registration {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement login_Btn = driver.findElement(By.xpath("//a[@class='login']"));

		login_Btn.click();

		Thread.sleep(2000);

		Actions a = new Actions(driver);

		WebElement email_address = driver.findElement(By.id("email_create"));

		a.moveToElement(email_address);

		Thread.sleep(3000);

		email_address.sendKeys("abc123@gmail.com");

		WebElement create_Btn = driver.findElement(By.xpath("//i[@class='icon-user left']"));

		create_Btn.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement gender_Radio_Btn = driver.findElement(By.id("id_gender1"));

		gender_Radio_Btn.click();

		WebElement first_Name = driver.findElement(By.xpath("(//input[@type='text'])[2]"));

		first_Name.sendKeys("James");

		WebElement last_Name = driver.findElement(By.xpath("(//input[@type='text'])[3]"));

		last_Name.sendKeys("Durairaj");

		// WebElement email_Id =
		// driver.findElement(By.xpath("(//input[@type='text'])[4]"));

		// email_Id.sendKeys("abc123@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));

		password.sendKeys("Password@123");

		WebElement dob_Days = driver.findElement(By.xpath("//select[@id='days']"));

		Select s = new Select(dob_Days);

		s.selectByValue("1");

		Thread.sleep(3000);

		WebElement dob_Months = driver.findElement(By.xpath("//select[@id='months']"));

		Select s1 = new Select(dob_Months);

		s1.selectByValue("2");

		WebElement dob_Years = driver.findElement(By.xpath("//select[@id='years']"));

		Select s2 = new Select(dob_Years);

		s2.selectByValue("1995");

		Thread.sleep(3000);

		WebElement add_first_name = driver.findElement(By.xpath("(//input[@type='text'])[5]"));

		add_first_name.sendKeys("James");

		WebElement add_last_name = driver.findElement(By.xpath("(//input[@type='text'])[6]"));

		add_first_name.sendKeys("Durairaj");

		WebElement add_company = driver.findElement(By.xpath("(//input[@type='text'])[7]"));

		add_company.sendKeys("Mechkaran");

		Thread.sleep(3000);

		WebElement add_Address = driver.findElement(By.xpath("(//input[@type='text'])[8]"));

		add_Address.sendKeys("342 E 11th Street,New York");

		WebElement add_Address_Line = driver.findElement(By.xpath("(//input[@type='text'])[9]"));

		add_Address_Line.sendKeys("First Ave, john f kenady");

		WebElement add_city = driver.findElement(By.xpath("(//input[@type='text'])[10]"));

		add_city.sendKeys("NewYork");

		WebElement add_state = driver.findElement(By.xpath("//select[@name='id_state']"));

		Select s3 = new Select(add_state);

		s3.selectByValue("32");

		WebElement add_Zipcode = driver.findElement(By.xpath("(//input[@type='text'])[11]"));

		add_Zipcode.sendKeys("10003");

		WebElement add_country = driver.findElement(By.xpath("//select[@name='id_country']"));

		Select s4 = new Select(add_country);

		s4.selectByVisibleText("United States");

		WebElement add_Information = driver.findElement(By.xpath("//textarea[@class='form-control']"));

		add_Information.sendKeys("near bakers street");
		
		Thread.sleep(3000);
		
		//WebElement add_phone = driver.findElement(By.xpath("(//input[@type='text'])[12]"));

		//add_phone.sendKeys("+1 212-349-0923");
			
		WebElement add_Mobile = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		
		add_Mobile.sendKeys("+1 512-738-3599");
		
		//WebElement add_Assign = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
				
		WebElement register_Btn = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
				
		register_Btn.click();
		
		
		
		
		
		
	}

}
