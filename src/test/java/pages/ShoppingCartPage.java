package pages;

import org.openqa.selenium.By;

public class ShoppingCartPage extends BasePage{
	
	public By removeProduct = By.xpath("//i[@class='fa fa-remove']");
	public By QuantityInputField = By.xpath("//input[@name='quantity");
	public By updateQuantity = By.xpath("//input[@title='Update']");
	public By checkoutButton = By.xpath("//a[contains(text(),'Checkout')]");
	

}
