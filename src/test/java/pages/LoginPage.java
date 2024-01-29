package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
	
	public String email = "favevi6671@konican.com";
	public String password = "Bd@12345678";
	public String loginPageURL= "https://eplaza.waltonbd.com/index.php?route=account/login";
	public String displayErrorMsg = "×\n" + "Warning: No match for E-Mail Address and/or Password.";
	
	public By emailInputField = By.xpath("//input[@id='email']");
	
	public By passwordInputField = By.xpath("//input[@id='password']");
	
	public By forgottenPaswordOption = By.xpath("//a[normalize-space()='Forgotten Password']");
	
	public By loginButton = By.xpath("//button[normalize-space()='Login']");
	
	public By errorMsgAlert = By.xpath("//div[@class='alert alert-danger']");
	
	public By continueButton_forRegisterAnAccount = By.xpath("//button[normalize-space()='Continue']");
	
	
	public void doLogin(String email, String password) {
		
		loadAWebPage(loginPageURL);
		writeOnAElement(emailInputField, email);
		writeOnAElement(passwordInputField, password);
		clickOnElement(loginButton);
		
	}

}
