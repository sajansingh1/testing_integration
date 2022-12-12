package flipkarttests;

import org.testng.annotations.Test;
import Flipkartpages.loginpage;
import Flipkartpages.productitemofferpage;

public class productitemoffertest extends baseclass{
	@Test (priority = 1, groups = { "sanity", "valid" })
	public void validLogin() throws InterruptedException 
	{
		
		loginpage login = new loginpage(driver);
		login.entermobilenumber("9306111145");
		login.enterPassword("Jio@458900");
		login.clickLogin();
		productitemofferpage obj = new productitemofferpage(driver);
		Thread.sleep(3000);
		obj.ClickTopOffers();
		Thread.sleep(2000);
		obj.ClickViewAll();
	}
}
