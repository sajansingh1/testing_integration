package flipkarttests;

import org.testng.annotations.Test;

import Flipkartpages.productsearchpage;

public class productsearchtest extends baseclass {

	@Test (priority = 1, groups = { "sanity", "valid" })
	public void searchproduct() throws InterruptedException 
	{
		productsearchpage Obj = new productsearchpage (driver);
		Thread.sleep(3000);
		Obj.CancelButton();
		Obj.EnterItem("alexa");
		Obj.ClickSearch();
		Thread.sleep(2000);
		Obj.ChooseItem();
	}
	
	
	@Test (priority = 2, groups = { "sanity", "Invalid" })
	public void searchepmtyproduct() throws InterruptedException 
	{
		productsearchpage  Obj = new productsearchpage (driver);
		Thread.sleep(3000);
		Obj.CancelButton();
		Obj.EnterItem(" ");
		Obj.ClickSearch();
	}
	
	
	@Test (priority = 3, groups = { "sanity", "Invalid" })
	public void searchwrongproduct() throws InterruptedException 
	{
		productsearchpage  Obj = new productsearchpage (driver);
		Thread.sleep(3000);
		Obj.CancelButton();
		Obj.EnterItem("judiguywvdduwdvcwwiucwcbcwvdvisgidvwiedwuei");
		Obj.ClickSearch();
	}
}
