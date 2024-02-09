package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import pages.ShoppingCartPage;
import utilities.DriverSetup;

public class TestShoppingCart extends DriverSetup{
	ProductPage productPage = new ProductPage();
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
	@Test
	public void testOpenShoppingCart() {
		loginPage.doLogin(loginPage.email, loginPage.password);
		homePage.clickOnElement(homePage.refrigeratorFreezerDropdown);
		homePage.clickOnElement(homePage.nonFrostRefrigeratorDropdownMenu);
		productPage.scrollToAElement(productPage.product_WNM2A7GDELXX);
		productPage.addToCart(productPage.product_WNM2A7GDELXX, 1, 1, 1, 2);
		productPage.clickOnElement(productPage.shoppingCartButton);
		Assert.assertEquals(shoppingCartPage.getElementText(shoppingCartPage.productName),"WNM-2A7-GDEL-XX\n"+ "- Selected Color: Color Depends on sto..");
		Assert.assertTrue(shoppingCartPage.getElement(shoppingCartPage.removeProduct).isDisplayed());	
		
	}
	
	
	@Test
	public void testUpdateCart() {
		loginPage.doLogin(loginPage.email, loginPage.password);
		homePage.clickOnElement(homePage.refrigeratorFreezerDropdown);
		homePage.clickOnElement(homePage.nonFrostRefrigeratorDropdownMenu);
		productPage.scrollToAElement(productPage.product_WNM2A7GDELXX);
		productPage.addToCart(productPage.product_WNM2A7GDELXX, 1, 1, 1, 2);
		productPage.clickOnElement(productPage.shoppingCartButton);
		Assert.assertTrue(shoppingCartPage.getElement(shoppingCartPage.quantityInputField).isEnabled());
		shoppingCartPage.clearField(shoppingCartPage.quantityInputField);
		shoppingCartPage.enterNumberOnAElement(shoppingCartPage.quantityInputField,1);
		shoppingCartPage.clickOnElement(shoppingCartPage.updateQuantity);
		Assert.assertEquals(shoppingCartPage.getAttributeValue(shoppingCartPage.quantityInputField,"value"), 1);
	}

}
