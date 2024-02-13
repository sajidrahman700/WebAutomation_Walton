package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import pages.ShoppingCartPage;
import utilities.DriverSetup;

public class TestCheckout extends DriverSetup{
	
	ProductPage productPage = new ProductPage();
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
	CheckoutPage checkOutPage = new CheckoutPage();
	
	
	@Test
	public void testOpenCheckout(){
		loginPage.doLogin(loginPage.email, loginPage.password);
		homePage.clickOnElement(homePage.refrigeratorFreezerDropdown);
		homePage.clickOnElement(homePage.nonFrostRefrigeratorDropdownMenu);
		productPage.scrollToAElement(productPage.product_WNM2A7GDELXX);
		productPage.addToCart(productPage.product_WNM2A7GDELXX, 1, 1, 1, 2);
		productPage.clickOnElement(productPage.shoppingCartButton);
		shoppingCartPage.clickOnElement(shoppingCartPage.checkoutButton);
		checkOutPage.waitForElementToBeClickable(checkOutPage.billingAddressContinueButton);
		Assert.assertTrue(checkOutPage.getElement(checkOutPage.billingAddressContinueButton).isDisplayed());
		
	}
	@Test
	public void testCheckout() throws InterruptedException{
		loginPage.doLogin(loginPage.email, loginPage.password);
		homePage.clickOnElement(homePage.refrigeratorFreezerDropdown);
		homePage.clickOnElement(homePage.nonFrostRefrigeratorDropdownMenu);
		productPage.scrollToAElement(productPage.product_WNM2A7GDELXX);
		productPage.addToCart(productPage.product_WNM2A7GDELXX, 1, 1, 1, 2);
		productPage.clickOnElement(productPage.shoppingCartButton);
		shoppingCartPage.clickOnElement(shoppingCartPage.checkoutButton);
		checkOutPage.clickOnElement(checkOutPage.billingAddressContinueButton);
		checkOutPage.clickOnElement(checkOutPage.deliveryAddressContinueButton);
		checkOutPage.waitForElementToBeClickable(checkOutPage.pickupFromPlazaRadioButton);
		checkOutPage.clickOnElement(checkOutPage.pickupFromPlazaRadioButton);
		checkOutPage.waitForElementToBeClickable(checkOutPage.deliveryMethodContinueButton);
		checkOutPage.clickOnElement(checkOutPage.deliveryMethodContinueButton);
		checkOutPage.waitForElementToBeClickable(checkOutPage.cashOnDeliveryPaymentMethod);
		checkOutPage.clickOnElement(checkOutPage.cashOnDeliveryPaymentMethod);
		checkOutPage.writeOnAElement(checkOutPage.addCommentInputField, "Product Should be intact");
		checkOutPage.waitForElementToBeClickable(checkOutPage.paymentMethodContinueButton);
		checkOutPage.clickOnElement(checkOutPage.paymentMethodContinueButton);
		checkOutPage.scrollToAElement(checkOutPage.confirmOrderButton);
		checkOutPage.waitForElementToBeClickable(checkOutPage.confirmOrderButton);
		Assert.assertTrue(checkOutPage.getElement(checkOutPage.confirmOrderButton).isDisplayed());
		
		
		
	}
	
	
	
	
	

}
