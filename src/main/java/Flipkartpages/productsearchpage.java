package Flipkartpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class productsearchpage {
	WebDriver driver;
	public productsearchpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(how = How.CLASS_NAME, using = "_2doB4z")
	public WebElement ClickCross;
	
	@FindBy(how = How.CLASS_NAME, using = "_3704LK")
	public WebElement Search;
	
	@FindBy(how = How.CLASS_NAME, using = "L0Z3Pu")
	public WebElement ClickSearch;
	
	@FindBy(how = How.CLASS_NAME, using = "s1Q9rs")
	public WebElement SelectItem;
	
	public void CancelButton()
	{
			ClickCross.click();
	}
	
	public void EnterItem(String Item)
	{
		Search.sendKeys(Item);
	}
	
	public void ClickSearch()
	{
		ClickSearch.click();
	}
	
	public void ChooseItem()
	{
		SelectItem.click();
	}
}
