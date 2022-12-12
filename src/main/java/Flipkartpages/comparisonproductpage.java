package Flipkartpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class comparisonproductpage {
	WebDriver driver;
	public comparisonproductpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(how = How.CLASS_NAME, using = "_3704LK")
	public WebElement Search;
	
	@FindBy(how = How.CLASS_NAME, using = "L0Z3Pu")
	public WebElement ClickSearch;
	@FindBy(how = How.CLASS_NAME, using = "_4rR01T")
	public WebElement SelectItem;
	
	@FindBy(how = How.XPATH, using = "//div[@class='_1YokD2 _3Mn1Gg']//div[2]//div[1]//div[1]//div[1]//a[1]//div[1]//div[2]//div[1]//label[1]//span[1]")
	public WebElement Checkbox;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'COMPARE')]")
	public WebElement CompareButton;
	
	
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
	
	public void ClickCheckbox()
	{
		Checkbox.click();
	}
	
	public void ClickCompareBox()
	{
		CompareButton.click();
	}
}
