package testcases;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import utilities.DriverSetup;

public class TestProductAddAndCheckout extends DriverSetup {
	
	ProductPage productPage = new ProductPage();
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	
	@Test
	public void testProduct() throws InterruptedException {
		
		loginPage.doLogin(loginPage.email, loginPage.password);
		homePage.clickOnElement(homePage.refrigeratorFreezerDropdown);
		homePage.clickOnElement(homePage.nonFrostRefrigeratorDropdownMenu);
		productPage.scrollToAElement(productPage.product_WNM2A7GDELXX);
		productPage.clickOnElement(productPage.product_WNM2A7GDELXX);
		productPage.clickOnElement(productPage.buyNowButton);
		productPage.selectDropdown(productPage.selectVersionTypeColour_Dropdown,1);
		productPage.selectDropdown(productPage.selectDistrict_Dropdown,1);
		productPage.selectDropdown(productPage.selectPlaza_Dropdown,1);
		Thread.sleep(5000);
		
		
		
		
		
	}
	

}
