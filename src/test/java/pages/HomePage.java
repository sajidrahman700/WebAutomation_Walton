package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
	
	public String homePageURL = "https://eplaza.waltonbd.com/";
	public String homePageTitle = "Walton - Walton At Every Home";
	
	public By myAccountDropdown = By.xpath("//span[normalize-space()='My Account']");
	public By registerDropdown_Menu = By.xpath("//a[normalize-space()='Register']");
	public By loginDropdown_Menu = By.xpath("//a[normalize-space()='Login']");
	
	

}
