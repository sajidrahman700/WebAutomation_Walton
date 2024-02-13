package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.DataSet;
import utilities.DriverSetup;

public class TestLogin extends DriverSetup {
	HomePage homePage = new HomePage();
	
	LoginPage loginPage = new LoginPage();
	
	AccountPage accountPage = new AccountPage();
	
	
	@Test
	public void testLoginWithValidCredentials() {
		getBrowser().get(homePage.homePageURL);
		homePage.clickOnElement(homePage.myAccountDropdown);
		homePage.clickOnElement(homePage.loginDropdown_Menu);
		loginPage.writeOnAElement(loginPage.emailInputField, loginPage.email);
		loginPage.writeOnAElement(loginPage.passwordInputField, loginPage.password);
		loginPage.clickOnElement(loginPage.loginButton);
		Assert.assertEquals(getBrowser().getCurrentUrl(), accountPage.accountPageURL );
			
	}
	
	
	@Test(dataProvider = "invalidUserDataForLogin", dataProviderClass = DataSet.class)
	public void testLoginWithInvalidCredentials(String email, String password, String displayErrorMsg) {
		getBrowser().get(homePage.homePageURL);
		homePage.clickOnElement(homePage.myAccountDropdown);
		homePage.clickOnElement(homePage.loginDropdown_Menu);
		loginPage.writeOnAElement(loginPage.emailInputField, email);
		loginPage.writeOnAElement(loginPage.passwordInputField, password);
		loginPage.clickOnElement(loginPage.loginButton);
		Assert.assertTrue(loginPage.getElement(loginPage.errorMsgAlert).isDisplayed());
		Assert.assertEquals(loginPage.getElementText(loginPage.errorMsgAlert), displayErrorMsg );
			
	}
	
	

}
