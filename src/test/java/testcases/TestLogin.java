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
	
	@Test
	public void testLoginWithInvalidPassword() {
		getBrowser().get(homePage.homePageURL);
		homePage.clickOnElement(homePage.myAccountDropdown);
		homePage.clickOnElement(homePage.loginDropdown_Menu);
		loginPage.writeOnAElement(loginPage.emailInputField, loginPage.email);
		loginPage.writeOnAElement(loginPage.passwordInputField, "ergwe4776");
		loginPage.clickOnElement(loginPage.loginButton);
		Assert.assertTrue(loginPage.getElement(loginPage.errorMsgAlert).isDisplayed());
		//System.out.println(loginPage.getElementText(loginPage.errorMsgAlert));
		Assert.assertEquals(loginPage.getElementText(loginPage.errorMsgAlert), loginPage.displayErrorMsg );
			
	}
	
	@Test
	public void testLoginWithInvalidEmail() {
		getBrowser().get(homePage.homePageURL);
		homePage.clickOnElement(homePage.myAccountDropdown);
		homePage.clickOnElement(homePage.loginDropdown_Menu);
		loginPage.writeOnAElement(loginPage.emailInputField, "dfdr@dhr");
		loginPage.writeOnAElement(loginPage.passwordInputField, loginPage.password);
		loginPage.clickOnElement(loginPage.loginButton);
		Assert.assertTrue(loginPage.getElement(loginPage.errorMsgAlert).isDisplayed());
		Assert.assertEquals(loginPage.getElementText(loginPage.errorMsgAlert), loginPage.displayErrorMsg );
			
	}
	
	@Test
	public void testLoginWithInvalidEmailPassword() {
		getBrowser().get(homePage.homePageURL);
		homePage.clickOnElement(homePage.myAccountDropdown);
		homePage.clickOnElement(homePage.loginDropdown_Menu);
		loginPage.writeOnAElement(loginPage.emailInputField, "y587@58h5");
		loginPage.writeOnAElement(loginPage.passwordInputField, "ergwe4776");
		loginPage.clickOnElement(loginPage.loginButton);
		Assert.assertTrue(loginPage.getElement(loginPage.errorMsgAlert).isDisplayed());
		Assert.assertEquals(loginPage.getElementText(loginPage.errorMsgAlert), loginPage.displayErrorMsg );
			
	}
	
	@Test
	public void testLoginWithoutPassword() {
		getBrowser().get(homePage.homePageURL);
		homePage.clickOnElement(homePage.myAccountDropdown);
		homePage.clickOnElement(homePage.loginDropdown_Menu);
		loginPage.writeOnAElement(loginPage.emailInputField, loginPage.email);
		loginPage.clickOnElement(loginPage.loginButton);
		Assert.assertTrue(loginPage.getElement(loginPage.errorMsgAlert).isDisplayed());
		Assert.assertEquals(loginPage.getElementText(loginPage.errorMsgAlert), loginPage.displayErrorMsg );
			
	}
	
	@Test
	public void testLoginWithoutEmail() {
		getBrowser().get(homePage.homePageURL);
		homePage.clickOnElement(homePage.myAccountDropdown);
		homePage.clickOnElement(homePage.loginDropdown_Menu);
		loginPage.writeOnAElement(loginPage.passwordInputField, loginPage.password);
		loginPage.clickOnElement(loginPage.loginButton);
		Assert.assertTrue(loginPage.getElement(loginPage.errorMsgAlert).isDisplayed());
		Assert.assertEquals(loginPage.getElementText(loginPage.errorMsgAlert), loginPage.displayErrorMsg );
			
	}
	
	@Test
	public void testLoginWithoutEmailPassword() {
		getBrowser().get(homePage.homePageURL);
		homePage.clickOnElement(homePage.myAccountDropdown);
		homePage.clickOnElement(homePage.loginDropdown_Menu);
		loginPage.clickOnElement(loginPage.loginButton);
		Assert.assertTrue(loginPage.getElement(loginPage.errorMsgAlert).isDisplayed());
		Assert.assertEquals(loginPage.getElementText(loginPage.errorMsgAlert), loginPage.displayErrorMsg );
			
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
