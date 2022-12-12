package flipkarttests;

import org.testng.annotations.Test;

import Flipkartpages.loginpage;

public class logintest extends baseclass {

	@Test (priority = 1, groups = { "sanity", "valid" })
	public void validcredentialLogin() throws InterruptedException 
	{
		
		loginpage login = new loginpage(driver);
		login.entermobilenumber("9306111145");
		login.enterPassword("Jio@458900");
		login.clickLogin();
	}
	
	@Test(priority = 2, groups = {"sanity", "invalid"})
	public void invalidcredentialLogin1() throws InterruptedException 
	{
		
		loginpage login = new loginpage(driver);
		login.entermobilenumber("9306111145");
		login.enterPassword("Jio");
		login.clickLogin();
	}
	
	@Test(priority = 3, groups = {"sanity", "invalid"})
	public void invalidcredentialLogin2() throws InterruptedException 
	{
		
		loginpage login = new loginpage(driver);
		login.entermobilenumber("93061111144");
		login.enterPassword("Jio@458900");
		login.clickLogin();
		
	}
	
	@Test(priority = 4, groups = {"sanity", "invalid"})
	public void invalidcredentialLogin4() throws InterruptedException 
	{
		
		loginpage login = new loginpage(driver);
		login.entermobilenumber("9306111145");
		login.enterPassword("");
		login.clickLogin();
	}
	
	@Test(priority = 5, groups = {"sanity", "invalid"})
	public void invalidLogin5() throws InterruptedException 
	{
		
		loginpage login = new loginpage(driver);
		login.entermobilenumber("");
		login.enterPassword("Jio@458900");
		login.clickLogin();
	}
	
	@Test(priority = 6, groups = {"sanity", "invalid"})
	public void invalidLogin6() throws InterruptedException 
	{
		
		loginpage login = new loginpage(driver);
		login.entermobilenumber("");
		login.enterPassword("");
		login.clickLogin();
	}
}
