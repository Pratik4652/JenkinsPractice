package test.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import test.elements.LandingPageElements;

public class Setup {

	public WebDriver chromedvr;
	@BeforeTest
	public void Login() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "webdrivers//chromedriver.exe");
		chromedvr = new ChromeDriver();	
		
		chromedvr.get("http://10.10.5.25:11506/admin/login/?next=/admin//");
		
		LandingPageElements LandingPageObj = new LandingPageElements(chromedvr);
		Thread.sleep(2000);
		LandingPageObj.SendUsername("sushant");
		Thread.sleep(2000);
		LandingPageObj.SendPassword("sushant1710");
		Thread.sleep(1000);
		LandingPageObj.LoginBtnClick();
	}
	
	@AfterTest
	public void BrowserExit(){
		chromedvr.quit();
	}
}
