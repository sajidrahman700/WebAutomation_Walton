package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.DataSet;
import utilities.DriverSetup;

public class TestLogin extends DriverSetup {
	HomePage homePage = new HomePage();
	
	LoginPage loginPage = new LoginPage();
	
	AccountPage accountPage = new AccountPage();
	
	
	@Test(description = "Verifying login functionality with valid credentials")
	@Description("User should be allowed to login with valid email and password")
	@Severity(SeverityLevel.CRITICAL)
	public void testLoginWithValidCredentials() {
		getBrowser().get(homePage.homePageURL);
		homePage.clickOnElement(homePage.myAccountDropdown);
		homePage.clickOnElement(homePage.loginDropdown_Menu);
		loginPage.writeOnAElement(loginPage.emailInputField, loginPage.email);
		loginPage.writeOnAElement(loginPage.passwordInputField, loginPage.password);
		loginPage.clickOnElement(loginPage.loginButton);
		Assert.assertEquals(getBrowser().getCurrentUrl(), accountPage.accountPageURL );
			
	}
	
	
	@Test(description = "Verifying login functionality with invalid credentials", dataProvider = "invalidUserDataForLogin", dataProviderClass = DataSet.class)
	@Description("User should not be allowed to login with invalid email and password")
	@Severity(SeverityLevel.CRITICAL)
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
