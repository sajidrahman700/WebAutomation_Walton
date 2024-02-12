package pages;

import org.openqa.selenium.By;

public class RegisterPage extends BasePage {
	
	public String registerPageURL= "https://eplaza.waltonbd.com/index.php?route=account/register";
	
	
	public By firstNameInputField = By.xpath("//input[@id='firstname']");
	public By lastNameInputField = By.xpath("//input[@id='lastname']");
	public By emailInputField = By.xpath("//input[@id='email']");
	public By mobileInputField = By.xpath("//input[@id='telephone']");
	public By addressInputField = By.xpath("//input[@id='address_1']");
	public By passwordInputField = By.xpath("//input[@id='password']");
	public By passwordConfirmInputField = By.xpath("//input[@id='confirm']");
	public By privacyPolicyCheckbox = By.xpath("//input[@name='agree']");
	public By continueButton = By.xpath("//button[normalize-space()='Continue']");
	

	public By firstNameErrorMsg = By.xpath("//span[normalize-space()='First Name must be between 2 and 32 characters!']");
	public By lastNameErrorMsg = By.xpath("//span[normalize-space()='Last Name must be between 2 and 32 characters!']");
	public By emailErrorMsg = By.xpath("//span[normalize-space()='E-Mail Address does not appear to be valid!']");
	public By mobileErrorMsg = By.xpath("//div[@class='panel-body']//div[2]//div[1]//div[2]//span[1]");
	public By addressErrorMsg = By.xpath("//span[normalize-space()='Address must be between 3 and 128 characters!']");
	public By passwordErrorMsg_TooShort = By.xpath("//span[normalize-space()='Password too short.']");
	public By passwordErrorMsg_UppercaseLeter = By.xpath("//span[contains(text(),'Password must include at least one uppercase lette')]");
	public By passwordErrorMsg_LowercaseLetter = By.xpath("//span[contains(text(),'Password must include at least one lowercase lette')]");
	public By passwordErrorMsg_Number = By.xpath("//span[normalize-space()='Password must include at least one number.']");
	public By passwordErrorMsg_SpecialCharacter = By.xpath("//span[contains(text(),'Password must include at least one special charact')]");
	public By passwordConfirmErrorMsg = By.xpath("//span[normalize-space()='Password confirmation does not match password!']");
	public By policyWarningAlert = By.xpath("//div[@class='alert alert-danger']");
	
	
	public String displayFirstNameErrorMsg = "First Name must be between 2 and 32 characters!";
	public String displayLastNameErrorMsg = "Last Name must be between 2 and 32 characters!" ;
	public String displayEmailErrorMsg = "E-Mail Address does not appear to be valid!";
	public String displayMobileErrorMsg = "Please enter 11 digits valid mobile number!\n" + "(01XXXXXXXXX)";
	public String displayAddressErrorMsg = "Address must be between 3 and 128 characters!";
	public String displayPasswordErrorMsg_TooShort = "Password too short.";
	public String displayPasswordErrorMsg_UppercaseLeter = "Password must include at least one uppercase letter.";
	public String displayPasswordErrorMsg_LowercaseLetter = "Password must include at least one lowercase letter.";
	public String displayPasswordErrorMsg_Number = "Password must include at least one number.";
	public String displayPasswordErrorMsg_SpecialCharacter = "Password must include at least one special character.";
	public String displayPasswordConfirmErrorMsg = "Password confirmation does not match password!";
	public String displayPolicyWarningAlert = "×\n" + "Warning: You must agree to the Privacy Policy!";

}
