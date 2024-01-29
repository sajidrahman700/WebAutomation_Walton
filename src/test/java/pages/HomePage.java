package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
	
	public String homePageURL = "https://eplaza.waltonbd.com/";
	public String homePageTitle = "Walton - Walton At Every Home";
	
	public By myAccountDropdown = By.xpath("//span[normalize-space()='My Account']");
	public By registerDropdown_Menu = By.xpath("//a[normalize-space()='Register']");
	public By loginDropdown_Menu = By.xpath("//a[normalize-space()='Login']");
	
	public By myAccountDropdown_Menu = By.xpath("//a[contains(text(),'My Account')]");
	public By logoutDropdown_Menu = By.xpath("//a[normalize-space()='Logout']");
	
	
	//Product Menu Locator
	public By refrigeratorFreezerDropdown = By.xpath("//a[@id='25']");
	public By nonFrostRefrigeratorDropdownMenu = By.xpath("//a[normalize-space()='Non-Frost Refrigerator']");
	
	
	
	

}
