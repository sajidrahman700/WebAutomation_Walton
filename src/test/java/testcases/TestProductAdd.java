package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import utilities.DriverSetup;

public class TestProductAdd extends DriverSetup {
	
	ProductPage productPage = new ProductPage();
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	
	@Test
	public void testSelectProduct(){
		
		loginPage.doLogin(loginPage.email, loginPage.password);
		homePage.clickOnElement(homePage.refrigeratorFreezerDropdown);
		homePage.clickOnElement(homePage.nonFrostRefrigeratorDropdownMenu);
		productPage.scrollToAElement(productPage.product_WNM2A7GDELXX);
		productPage.clickOnElement(productPage.product_WNM2A7GDELXX);
		productPage.waitForElementToBeClickable(productPage.buyNowButton);
		Assert.assertEquals(productPage.getElementText(productPage.productTitle_WNM2A7GDELXX)," WNM-2A7-GDEL-XX");
		
	}
	
	@Test
	public void testAddToCart() throws InterruptedException{
		loginPage.doLogin(loginPage.email, loginPage.password);
		homePage.clickOnElement(homePage.refrigeratorFreezerDropdown);
		homePage.clickOnElement(homePage.nonFrostRefrigeratorDropdownMenu);
		productPage.scrollToAElement(productPage.product_WNM2A7GDELXX);
		productPage.clickOnElement(productPage.product_WNM2A7GDELXX);
		
		
		productPage.clickOnElement(productPage.buyNowButton);
		productPage.selectDropdown(productPage.selectVersionTypeColour_Dropdown,1);
		productPage.selectDropdown(productPage.selectDistrict_Dropdown,1);
		productPage.selectDropdown(productPage.selectPlaza_Dropdown,1);
		productPage.clearField(productPage.quantityInputField);
		productPage.enterNumberOnAElement(productPage.quantityInputField,2);
		productPage.clickOnElement(productPage.addToCartButton);
		Assert.assertEquals(productPage.getElementText(productPage.successAddToCartAlert),"×\n" + "Success: You have added WNM-2A7-GDEL-XX to your shopping cart!");

		
	}
	

}
