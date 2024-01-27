package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
	
	public String email = "favevi6671@konican.com";
	public String password = "Bd@12345678";
	
	public By emailInputField = By.xpath("//input[@id='email']");
	public By passwordInputField = By.xpath("//input[@id='password']");
	public By forgottenPaswordOption = By.xpath("//a[normalize-space()='Forgotten Password']");
	public By loginButton = By.xpath("//button[normalize-space()='Login']");
	public By continueButton_forRegisterAnAccount = By.xpath("//button[normalize-space()='Continue']");

}
