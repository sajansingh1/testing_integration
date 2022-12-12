package Flipkartpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class signupcredentialspage {
	WebDriver driver;
	public signupcredentialspage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	@FindBy(how = How.XPATH, using = "//a[@class='_14Me7y']")
	public WebElement SignUp;
	
	@FindBy(how = How.XPATH, using = "//input[@class='_2IX_2- VJZDxU']")
	public WebElement EnterMobile;
	
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='CONTINUE']")
	public WebElement Continue;
	
	public void clickSignUp()
	{
		SignUp.click();
	}
	
	public void enterMobile(String Mobile)
	{
		EnterMobile.sendKeys(Mobile);
	}
	
	public void clickContinue()
	{
		Continue.click();
	}
}
