package FlipkartAutomation;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import pageObject.cart;
import pageObject.cartAmazon;
import pageObject.searchPage;
import pageObject.searchResult;
import resources.base;


public class searchResult_Page {
	
	WebDriver driver;
	public searchResult_Page(WebDriver driver) {		
		this.driver=driver;		
	}
	
	public void getPrice() throws IOException
	{
		searchResult sR= new searchResult(driver);
		String priceOfProduct=sR.priceOfProduct().getText();
		System.out.println("Price of Product is : "+priceOfProduct);
	}
	
	public void clickOnAddToCart() throws IOException
	{
		searchResult sR= new searchResult(driver);
		sR.addToCartButton().click();
	}
	
	public String nameOfTheProduct() throws IOException
	{
		searchResult sR= new searchResult(driver);
		String nameOfProduct=sR.nameOfProduct().getText();
		System.out.println("Total Price of the Product after adding another is : "+nameOfProduct);
		return nameOfProduct;
	}
	
}
