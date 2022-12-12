package flipkarttests;

import org.testng.annotations.Test;

import Flipkartpages.comparisonproductpage;
import Flipkartpages.loginpage;


public class comparisonproducttest extends baseclass {
	@Test (priority = 1, groups = { "sanity", "valid" })
	public void AddItem() throws InterruptedException 
	{
		
		 loginpage login = new loginpage(driver);
		 login.entermobilenumber("8685004647");
		login.enterPassword("sajan@123");
		login.clickLogin();
		Thread.sleep(2000);
		comparisonproductpage obj = new comparisonproductpage(driver);
		obj.EnterItem("samsung");
		obj.ClickSearch();
		Thread.sleep(2000);
		obj.ClickCheckbox();
		Thread.sleep(2000);
		obj.ClickCompareBox();	
	}
}
