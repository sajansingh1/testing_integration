package flipkarttests;

import org.testng.annotations.Test;

import Flipkartpages.signupcredentialspage;

public class signupcredentialstest extends baseclass {
	@Test (priority = 1, groups = { "sanity", "Invalid" })
	public void invalidsignUpcredential1() throws InterruptedException 
	{
		signupcredentialspage login = new signupcredentialspage(driver);
		Thread.sleep(2000);
		login.clickSignUp();
		Thread.sleep(2000);
		login.enterMobile("8685004647");
		login.clickContinue();
	}
	
	@Test (priority = 2, groups = { "sanity", "valid" })
	public void invalidsignUpcredential2() throws InterruptedException 
	{
		signupcredentialspage login = new signupcredentialspage(driver);
		Thread.sleep(2000);
		login.clickSignUp();
		Thread.sleep(2000);
		login.enterMobile("lava");
		login.clickContinue();
	}
	
	@Test (priority = 3, groups = { "sanity", "valid" })
	public void invalidsignUpcredential3() throws InterruptedException 
	{
		signupcredentialspage login = new signupcredentialspage(driver);
		Thread.sleep(2000);
		login.clickSignUp();
		Thread.sleep(2000);
		login.enterMobile("90987");
		login.clickContinue();
	}
	
	@Test (priority = 4, groups = { "sanity", "valid" })
	public void validsignUpcredential() throws InterruptedException 
	{
		signupcredentialspage login = new signupcredentialspage(driver);
		Thread.sleep(2000);
		login.clickSignUp();
		Thread.sleep(2000);
		login.enterMobile("8685004647");
		login.clickContinue();
	}
	
	@Test (priority = 5, groups = { "sanity", "valid" })
	public void emptysignupcredential() throws InterruptedException 
	{
		signupcredentialspage login = new signupcredentialspage(driver);
		Thread.sleep(2000);
		login.clickSignUp();
		Thread.sleep(2000);
		login.enterMobile(" ");
		login.clickContinue();
	}
}
