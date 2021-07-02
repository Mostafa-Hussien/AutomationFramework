package tests;

import org.testng.annotations.Test;


import org.testng.Assert;

import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;
import utilities.Helper;

public class UserLoginTest extends TestBase {

	LandingPage landingObject ; 
	LoginPage  loginObject ;
	HomePage  homeObject ; 
	String  username = "testing.geeks.test@gmail.com" ; 
	String password = "Testing@2021" ; 


	@Test
	public void userCanLoginSuccssfully ( ) 
	{ 

		landingObject = new LandingPage(driver) ; 
		landingObject.openLoginPage();
		loginObject = new LoginPage(driver) ; 
		loginObject.enterUsername(username);
		Helper.waitUntilElementIsVisible(driver, loginObject.passwordTxtBox, 10);
		loginObject.enterPassword(password);
		homeObject = new HomePage(driver) ; 
		Helper.waitUntilElementIsVisible(driver,homeObject.customizeBtn, 30);
		Assert.assertTrue(homeObject.customizeBtn.isDisplayed());
	}


	@Test
	public void loginWithNoCredentials ( ) 
	{
		String errorMessage= "Required data missing";
		landingObject = new LandingPage(driver) ;
		landingObject.openLoginPage();
		loginObject = new LoginPage(driver) ; 
		loginObject.userLoginWithNoCredentials(); 
		Helper.waitUntilElementIsVisible(driver, loginObject.errormessage, 10);
		Assert.assertEquals(loginObject.errormessage.getText(),errorMessage);

	}  


}
