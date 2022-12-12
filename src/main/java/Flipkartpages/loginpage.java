package Flipkartpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	WebDriver driver;
	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Enter Email/Mobile number')]/../..//input")
	public WebElement mobile;
	
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Enter Password')]/../..//input")
	public WebElement password;
	
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Login')]/../..//button")
	public WebElement Login;
		
	public void entermobilenumber(String userMobile)
	{
		mobile.sendKeys(userMobile);
	}
	
	
	public void enterPassword(String pass) 
	{
		password.click();
		password.sendKeys(pass);
	}
	
	public void clickLogin() 
	{
		Login.click();
	}
}
