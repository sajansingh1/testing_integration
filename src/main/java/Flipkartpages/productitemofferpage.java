package Flipkartpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class productitemofferpage {
	WebDriver driver;
	public productitemofferpage(WebDriver driver)
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
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]")
	public WebElement TopOffers;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")
	public WebElement ViewAll;
	
	public void enterUserMobile(String userMobile)
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
	
	public void ClickTopOffers() 
	{
		TopOffers.click();
	}
	
	public void ClickViewAll() 
	{
		ViewAll.click();
	}
}
