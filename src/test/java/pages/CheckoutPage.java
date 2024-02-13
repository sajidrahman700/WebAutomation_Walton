package pages;

import org.openqa.selenium.By;

public class CheckoutPage extends BasePage {
	
	public By billingAddressContinueButton = By.xpath("//input[@id='button-payment-address']");
	public By deliveryAddressContinueButton = By.xpath("//input[@id='button-shipping-address']");
	public By pickupFromPlazaRadioButton = By.xpath("//input[@id='pickup.pickup']");
	public By freeShippingRadioButton = By.xpath("//input[@id='free.free']");
	public By deliveryMethodContinueButton = By.xpath("//input[@id='button-shipping-method']");
	public By addCommentInputField= By.xpath("//div[@class='tab-content']//textarea[@name='comment']");
	public By cashOnDeliveryPaymentMethod = By.xpath("//img[@title='Pay with Cash On Delivery']");
	public By paymentMethodContinueButton = By.xpath("//input[@id='button-payment-method']");
	public By confirmOrderButton = By.xpath("//input[@id='button-confirm']");
	public By productName = By.xpath("//a[normalize-space()='WNM-2A7-GDEL-XX']");
	

}
