package Flipkartpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class sellerspage {
	WebDriver driver;
	public sellerspage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	@FindBy(how = How.XPATH, using = "//button[@class='_2KpZ6l _2doB4z']")
	public WebElement Cross;
	
	@FindBy(how = How.XPATH, using = "//a[@class='_3-PJz-']//span[contains(text(),'Become a Seller')]")
	public WebElement BecomeSeller;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Enter 10 digit phone number here']")
	public WebElement EnterNumber;
	
	@FindBy(how = How.XPATH, using = "//div[@class='styles__RegisterText-r412un-24 sILEL']")
	public WebElement Register;
	
	public void ClickCross()
	{
		Cross.click();
	}
	
	public void ClickBecomeSeller()
	{
		BecomeSeller.click();
	}
	
	public void ClickEnterNumber(String Number)
	{
		EnterNumber.sendKeys(Number);
	}

	public void ClickRegister()
	{
		Register.click();
	}
}
