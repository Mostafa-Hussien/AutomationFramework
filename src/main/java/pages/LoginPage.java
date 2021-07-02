package pages;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
	}


	@FindBy (id= "username")
	WebElement userNameTxtBox ; 


	@FindBy (id= "loginButton")
	WebElement continueBtn ;


	@FindBy(id="password")
	public  WebElement passwordTxtBox ;

	@FindBy (id = "loginButton")
	WebElement signinBtn ; 

	@FindBy (id="responseMessage")
	public WebElement  errormessage ; 






	public void enterUsername (String username)
	{
		setTextEelemetText(userNameTxtBox, username);
		clickButton(continueBtn);
	}

	public void enterPassword(String password)
	{
		setTextEelemetText(passwordTxtBox, password);
		clickButton(signinBtn);
	}


	public void userLoginWithNoCredentials  ()
	{
		clickButton(continueBtn);
	
	}



}
