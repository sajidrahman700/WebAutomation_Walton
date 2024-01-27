package testcases;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utilities.DriverSetup;

public class TestLogin extends DriverSetup {
	HomePage homePage = new HomePage();
	
	LoginPage loginPage = new LoginPage();
	
	
	@Test
	public void test() {
		getBrowser().get(homePage.homePageURL);
		homePage.clickOnElement(homePage.myAccountDropdown);
		homePage.clickOnElement(homePage.loginDropdown_Menu);
		loginPage.writeOnAElement(loginPage.emailInputField, loginPage.email);
		loginPage.writeOnAElement(loginPage.passwordInputField, loginPage.password);
		loginPage.clickOnElement(loginPage.loginButton);
		
		
	}
	

}
