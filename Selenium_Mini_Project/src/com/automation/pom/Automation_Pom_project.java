package com.automation.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.miniproject.Base_Class;

public class Automation_Pom_project extends Base_Class {

	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		driver = getBrowser("chrome");

		getUrl("http://automationpractice.com/index.php");

		pageTimeOuts(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Home_Page home = new Home_Page(driver);

		clickOnElement(home.getLogin_Btn());

		Login_Page lp = new Login_Page(driver);
		inputValueElement(lp.getEmail_address(), "abc123@gmail.com");

		inputValueElement(lp.getPasswd(), "Password@123");

		clickOnElement(lp.getSignin());

		Thread.sleep(3000);

		Women_Booking_Page wbp = new Women_Booking_Page(driver);

		Actions(wbp.getWomen_tab(), "moveToElement");
		Actions(wbp.getEvening_Tab(), "moveToElement");
		clickOnElement(wbp.getEvening_Tab());

		Thread.sleep(3000);

		Evening_Dress_Page edp = new Evening_Dress_Page(driver);

		scroll(edp.getManufacturer());
		Actions(edp.getPrinted_Tab(), "moveToElement");
		Actions(edp.getQuick_view(), "moveToElement");
		clickOnElement(edp.getQuick_view());

		driver.switchTo().frame(0);

		Popup_Page_Frame ppf = new Popup_Page_Frame(driver);

		clickOnElement(ppf.getIncrement());
		singleDropDown(ppf.getSize(), "value", "2");
		clickOnElement(ppf.getColour());
		clickOnElement(ppf.getAdd_cart());

		Thread.sleep(3000);

		Proceed_checkout_1 pc1 = new Proceed_checkout_1(driver);
		clickOnElement(pc1.getProceed1());

		Thread.sleep(3000);

		Shopping_Cart_Summary scs = new Shopping_Cart_Summary(driver);
		clickOnElement(scs.getProceed_to_checkout2());

		Address_Tab_Proceed atp = new Address_Tab_Proceed(driver);
		clickOnElement(atp.getProceed_checkout3());

		Thread.sleep(3000);

		Shipping_Tab_Proceed stp = new Shipping_Tab_Proceed(driver);
		clickOnElement(stp.getCheckbox());
		clickOnElement(stp.getProceed_Checkout_4());

		Payment_By_Bank pbb = new Payment_By_Bank(driver);

		scroll(pbb.getPay_by_bank_scroll());
		clickOnElement(pbb.getPay_by_bank());

		implicitWait(20, TimeUnit.SECONDS);

		Payment_Bank_Confirm pbc = new Payment_Bank_Confirm(driver);
		clickOnElement(pbc.getI_Confirm_Order());

		implicitWait(20, TimeUnit.SECONDS);

		TakeScreenShot_1 ts1 = new TakeScreenShot_1(driver);
		scroll(ts1.getScroll_payment());
		TakesScreenshots("C:\\Users\\Sande_000\\Desktop\\java\\Selenium_Mini_Project\\Screenshots\\snapper"
				+ System.currentTimeMillis() + "pomsnap.png");

		Thread.sleep(2000);

		Purchase2_Women_Tab p2wt = new Purchase2_Women_Tab(driver);

		Actions(p2wt.getWomen_Tab_2(), "moveToElement");
		Actions(p2wt.getTshirt_Tab(), "moveToElement");
		clickOnElement(p2wt.getTshirt_Tab());

		implicitWait(10, TimeUnit.SECONDS);

		Tshirt_Page tp = new Tshirt_Page(driver);
		scroll(tp.getScroll_Range());
		Actions(tp.getQuick_View2(), "moveToElement");
		Actions(tp.getQuick_View3(), "moveToelement");
		clickOnElement(tp.getQuick_View3());

		driver.switchTo().frame(0);

		Popup_Page_Frame2 ppf2 = new Popup_Page_Frame2(driver);
		clickOnElement(ppf2.getAdd_Btn1());
		singleDropDown(ppf2.getSelect_Medium1(), "value", "2");
		clickOnElement(ppf2.getColour_dress1());
		clickOnElement(ppf2.getCart1());

		Thread.sleep(3000);

		Proceed_To_checkout2 ptc2=new Proceed_To_checkout2(driver);
		clickOnElement(ptc2.getProceed_Kart2());
		
		Shopping_Cart_Summary2 scs2=new Shopping_Cart_Summary2(driver);
		clickOnElement(scs2.getCheckout_123());
		
		Address_Tab_Payment2 atp2=new Address_Tab_Payment2(driver);
		clickOnElement(atp2.getProceed_Checkout_211());

		Thread.sleep(3000);
		
		Shipping_Tab_Proceed2 stp2=new Shipping_Tab_Proceed2(driver);
		clickOnElement(stp2.getCheckBox111());
		clickOnElement(stp2.getCheckBox3111());
		
		Payment_By_Check pbc1=new Payment_By_Check(driver);
		clickOnElement(pbc1.getPay_By_Check());
		
		Payment_Check_Confirm pcc1= new Payment_Check_Confirm(driver);
		clickOnElement(pcc1.getIconfirm11());
		
		Sign_Out so=new Sign_Out(driver);
		clickOnElement(so.getSign_Out());
		
		driver.close();
		

		
	}
}
