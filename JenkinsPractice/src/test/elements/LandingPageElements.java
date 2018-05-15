package test.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPageElements {

	WebDriver dvr;
    public LandingPageElements(WebDriver paramdvr) {
        PageFactory.initElements(paramdvr, this);
        this.dvr = paramdvr;
    }
    
    
    //Elements
    @FindBy(xpath="//*[@placeholder='Username']")
    WebElement UsernameFieldElement;
    
    @FindBy(xpath="//*[@placeholder='Password']")
    WebElement PasswordFieldElement;
    
    @FindBy(xpath="//*[contains(text(),'Login') and @type='submit']")
    WebElement LoginButtonElement;
    
   @FindBy(xpath="//*[@type='submit' and @value = 'Add Apps']")
   WebElement AddAppsBtnElement;
   
   @FindBy(xpath="//*[contains(text(),'Forecast')]")
   WebElement ForcastBtnElement;
   
   @FindBy(xpath="//*[contains(text(),'Log out')]")
   WebElement LogoutBtnElement;
    
    
    //Functions
   public void LogoutBtnClick(){
	   LogoutBtnElement.click();
   }
   public void ForcastBtnClick(){
	   ForcastBtnElement.click();
   }
   public void AddAppsBtnClick(){
	   AddAppsBtnElement.click();
   }
    public void LoginBtnClick(){
    	LoginButtonElement.click();
    }
    public void SendUsername(String Username){
    	UsernameFieldElement.sendKeys(Username);
    }
    public void SendPassword(String Password){
    	PasswordFieldElement.sendKeys(Password);
    }
    
}
