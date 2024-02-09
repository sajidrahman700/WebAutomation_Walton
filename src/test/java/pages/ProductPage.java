package pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage {
	
	
	public By  product_WNM2A7GDELXX = By.xpath("//div[@class='container-fluid']//div[@class='container-fluid']//img[@alt='WNM-2A7-GDEL-XX']");
	public By  product_WNM2A7RXXXRP  = By.xpath("//div[@class='container-fluid']//div[@class='container-fluid']//img[@alt='WNM-2A7-RXXX-RP']");
	public By  product_WNM2F1GEHEXX  = By.xpath("//div[@class='container-fluid']//div[@class='container-fluid']//img[@alt='WNM-2F1-GEHE-XX (Inverter)']");
	public By productTitle_WNM2A7GDELXX = By.xpath("//tbody//tr//h1//span[1]");
	
	public By buyNowButton = By.xpath("//a[@id='buyNowBtn']");
	public By selectVersionTypeColour_Dropdown = By.xpath("//select[@id='color']");
	public By selectDistrict_Dropdown = By.xpath("//select[@id='district']");
	public By selectPlaza_Dropdown = By.xpath("//select[@id='plazas']");
	public By quantityInputField = By.xpath("//input[@id='quantity']");
	public By addToCartButton = By.xpath("//button[normalize-space()='Add To Cart']");
	public By shoppingCartButton = By.xpath("//a[normalize-space()='Shopping Cart']");
	public By successAddToCartAlert = By.xpath("//div[@class='alert alert-success']");
	
	
	public void addToCart(By locator, int colour, int district, int plaza, int quantity) {
		clickOnElement(locator);
		clickOnElement(buyNowButton);
		selectDropdown(selectVersionTypeColour_Dropdown, colour);
		selectDropdown(selectDistrict_Dropdown, district);
		selectDropdown(selectPlaza_Dropdown, plaza);
		clearField(quantityInputField);
		enterNumberOnAElement(quantityInputField, quantity);
		clickOnElement(addToCartButton);
		
		
	}

}
