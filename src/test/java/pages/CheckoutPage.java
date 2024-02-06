package pages;

import org.openqa.selenium.By;

public class CheckoutPage extends BasePage {
	
	public By paymentAddressContinueButton = By.xpath("//input[@id='button-payment-address']");
	public By deliveryAddressContinueButton = By.xpath("//input[@id='button-shipping-address']");
	public By pickupFromPlazaRadioButton = By.xpath("//input[@id='pickup.pickup']");
	public By freeShippingRadioButton = By.xpath("//input[@id='free.free']");
	public By deliveryMethodContinueButton = By.xpath("//input[@id='button-shipping-method']");
	public By addCommentInputField= By.xpath("//div[@class='tab-content']//textarea[@name='comment']");
	public By termsAndConditionCheckbox = By.xpath("//input[@name='agree']");
	public By paymentMethodContinueButton = By.xpath("//input[@id='button-payment-method']");
	

}
