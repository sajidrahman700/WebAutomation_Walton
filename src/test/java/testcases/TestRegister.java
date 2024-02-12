package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.RegisterPage;
import utilities.DataSet;
import utilities.DriverSetup;

public class TestRegister extends DriverSetup {
	
	HomePage homePage = new HomePage();
	RegisterPage registerPage = new RegisterPage();
	
	@Test(dataProvider = "invalidUserDataForRegister", dataProviderClass = DataSet.class)
	public void testWithInvalidCredential(String firstName, String lastName, String email, String mobile, String address, String password, String confirmPassword, By locator, String displayErrorMsg ){
		getBrowser().get(homePage.homePageURL);
		homePage.clickOnElement(homePage.myAccountDropdown);
		homePage.clickOnElement(homePage.registerDropdown_Menu);
		registerPage.writeOnAElement(registerPage.firstNameInputField,firstName);
		registerPage.writeOnAElement(registerPage.lastNameInputField, lastName);
		registerPage.writeOnAElement(registerPage.emailInputField, email);
		registerPage.writeOnAElement(registerPage.mobileInputField, mobile);
		registerPage.writeOnAElement(registerPage.addressInputField, address);
		registerPage.writeOnAElement(registerPage.passwordInputField, password);
		registerPage.writeOnAElement(registerPage.passwordConfirmInputField, confirmPassword);
		registerPage.clickOnElement(registerPage.continueButton);
		Assert.assertTrue(registerPage.getElement(locator).isDisplayed());
		Assert.assertEquals(registerPage.getElementText(locator), displayErrorMsg );
		
	}

}
