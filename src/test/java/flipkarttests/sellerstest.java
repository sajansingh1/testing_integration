package flipkarttests;

import org.testng.annotations.Test;

import Flipkartpages.sellerspage;

public class sellerstest extends baseclass {

	@Test (priority = 1, groups = { "sanity", "valid" })
	public void validseller() throws InterruptedException 
	{
		
		sellerspage login = new sellerspage(driver);
		login.ClickCross();
		Thread.sleep(2000);
		login.ClickBecomeSeller();
		Thread.sleep(2000);
		login.ClickEnterNumber("8685004647");
		Thread.sleep(2000);
		login.ClickRegister();
		Thread.sleep(2000);
	}
	
	@Test (priority = 2, groups = { "sanity", "Invalid" })
	public void invalidseller1() throws InterruptedException 
	{
		
		sellerspage login = new sellerspage(driver);
		login.ClickCross();
		Thread.sleep(2000);
		login.ClickBecomeSeller();
		Thread.sleep(2000);
		login.ClickEnterNumber("pqrestui");
		Thread.sleep(2000);
		login.ClickRegister();
		Thread.sleep(2000);
		
	}
	
	@Test (priority = 3, groups = { "sanity", "Invalid" })
	public void invalidseller2() throws InterruptedException 
	{
		
		sellerspage login = new sellerspage(driver);
		login.ClickCross();
		Thread.sleep(2000);
		login.ClickBecomeSeller();
		Thread.sleep(2000);
		login.ClickEnterNumber(" ");
		Thread.sleep(2000);
		login.ClickRegister();
		Thread.sleep(2000);
		
	}
	
	@Test (priority = 4, groups = { "sanity", "Invalid" })
	public void invalidseller3() throws InterruptedException 
	{
		
	 sellerspage login = new sellerspage(driver);
		login.ClickCross();
		Thread.sleep(2000);
		login.ClickBecomeSeller();
		Thread.sleep(2000);
		login.ClickEnterNumber("97896");
		Thread.sleep(2000);
		login.ClickRegister();
		Thread.sleep(2000);
		
	}
}
