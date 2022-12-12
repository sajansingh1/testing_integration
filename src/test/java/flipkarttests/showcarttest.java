package flipkarttests;

import org.testng.annotations.Test;

import Flipkartpages.loginpage;
import Flipkartpages.showcartpage;

public class showcarttest extends baseclass {
	@Test (priority = 1, groups = { "sanity", "valid" })
	public void showcart() throws InterruptedException 
	{
		showcartpage Obj = new showcartpage(driver);
		loginpage obj1 = new loginpage(driver);
		Thread.sleep(2000);
		obj1.entermobilenumber("8685004647");
		obj1.enterPassword("sajan@123");
		obj1.clickLogin();
		Thread.sleep(3000);
		Obj.ViewCart();
		Thread.sleep(2000);
	}
}
