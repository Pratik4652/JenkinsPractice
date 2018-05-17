package test.tests;

import org.testng.annotations.Test;

import test.elements.LandingPageElements;

public class GeneralFlow extends Setup{

	
	@Test
	public void GeneralFlowForTesting() throws InterruptedException{
		LandingPageElements LandObj = new LandingPageElements(chromedvr);
		
		Thread.sleep(2000);
		LandObj.AddAppsBtnClick();
		Thread.sleep(2000);
		chromedvr.navigate().back();
		Thread.sleep(2000);
		LandObj.ForcastBtnClick();
		Thread.sleep(2000);
		LandObj.LogoutBtnClick();
		Thread.sleep(2000);
	}
}
