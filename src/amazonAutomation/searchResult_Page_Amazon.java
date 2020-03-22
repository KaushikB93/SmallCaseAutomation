package amazonAutomation;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import pageObject.cart;
import pageObject.searchPage;
import pageObject.searchResult;
import pageObject.searchResultAmazon;
import resources.base;


public class searchResult_Page_Amazon {
	
	WebDriver driver;
	public searchResult_Page_Amazon(WebDriver driver) {		
		this.driver=driver;		
	}
	
	public void getPriceAmazon() throws IOException
	{
		searchResultAmazon sR= new searchResultAmazon(driver);
		String priceOfProduct=sR.priceOfProductAmazon().getText();
		System.out.println("Price of Product is : "+priceOfProduct);
	}
	
	public void clickOnAddToCartAmazon() throws IOException
	{
		searchResultAmazon sR= new searchResultAmazon(driver);
		sR.addToCartButtonAmazon().click();
	}
	
	public void clickOnCartAmazon() throws IOException
	{
		searchResultAmazon sR= new searchResultAmazon(driver);
		sR.goToCartButtonAmazon().click();
	}
	
	public String nameOfTheProductAmazon() throws IOException
	{
		searchResultAmazon sR= new searchResultAmazon(driver);
		String nameOfProductAmazon=sR.nameOfProductAmazon().getText();
		System.out.println("Total Price of the Product after adding another is : "+nameOfProductAmazon);
		return nameOfProductAmazon;
	}
	
}
