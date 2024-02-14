package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
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
	
	@Test(description = "Verify that shopping cart should open")
	@Description("Shopping cart is opened and display remove product option after clicking the shopping cart button")
	public void testOpenShoppingCart() {
		loginPage.doLogin(loginPage.email, loginPage.password);
		homePage.clickOnElement(homePage.refrigeratorFreezerDropdown);
		homePage.clickOnElement(homePage.nonFrostRefrigeratorDropdownMenu);
		productPage.scrollToAElement(productPage.product_WNM2A7GDELXX);
		productPage.addToCart(productPage.product_WNM2A7GDELXX, 1, 1, 1, 2);
		productPage.clickOnElement(productPage.shoppingCartButton);
		shoppingCartPage.waitForElementToBeClickable(shoppingCartPage.removeProduct);
		Assert.assertTrue(shoppingCartPage.getElement(shoppingCartPage.removeProduct).isDisplayed());	
		
	}
	
	
	@Test(description = "Verify that user can update the cart")
	@Description("Quantity option should be enabled and should update the cart")
	public void testUpdateCart() {
		loginPage.doLogin(loginPage.email, loginPage.password);
		homePage.clickOnElement(homePage.refrigeratorFreezerDropdown);
		homePage.clickOnElement(homePage.nonFrostRefrigeratorDropdownMenu);
		productPage.scrollToAElement(productPage.product_WNM2A7GDELXX);
		productPage.addToCart(productPage.product_WNM2A7GDELXX, 1, 1, 1, 2);
		productPage.clickOnElement(productPage.shoppingCartButton);
		productPage.takeScreenShot("Quantity input field is enable or not");
		Assert.assertTrue(shoppingCartPage.getElement(shoppingCartPage.quantityInputField).isEnabled());
		/*shoppingCartPage.clearField(shoppingCartPage.quantityInputField);
		shoppingCartPage.enterNumberOnAElement(shoppingCartPage.quantityInputField,1);
		shoppingCartPage.clickOnElement(shoppingCartPage.updateQuantity);
		Assert.assertEquals(shoppingCartPage.getAttributeValue(shoppingCartPage.quantityInputField,"value"), 1);*/
	}
	
	@Test(description = "Verify that product should be remove from the cart")
	@Description("After remove the product a Cart Empty alert should be displayed")
	public void testRemoveProductFromCart() {
		loginPage.doLogin(loginPage.email, loginPage.password);
		homePage.clickOnElement(homePage.refrigeratorFreezerDropdown);
		homePage.clickOnElement(homePage.nonFrostRefrigeratorDropdownMenu);
		productPage.scrollToAElement(productPage.product_WNM2A7GDELXX);
		productPage.addToCart(productPage.product_WNM2A7GDELXX, 1, 1, 1, 2);
		productPage.clickOnElement(productPage.shoppingCartButton);
		shoppingCartPage.clickOnElement(shoppingCartPage.removeProduct);
		shoppingCartPage.waitForElementPresence(shoppingCartPage.cartEmptyAlert);
		Assert.assertTrue(shoppingCartPage.getElement(shoppingCartPage.cartEmptyAlert).isDisplayed());
		
	}

}
