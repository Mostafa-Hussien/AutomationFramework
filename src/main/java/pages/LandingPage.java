package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LandingPage  extends PageBase {

	public LandingPage(WebDriver driver) {
		super(driver);
	}


	@FindBy (xpath="(//a[@href=\"https://www.evernote.com/Login.action\"])[1]")
	WebElement  loginLink ;
	
	
	public void openLoginPage ( ) {
		clickButton(loginLink);
	}
	
	
	

}
