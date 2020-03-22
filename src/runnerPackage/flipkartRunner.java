package runnerPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import FlipkartAutomation.search_Page;
import FlipkartAutomation.cartPage;
import FlipkartAutomation.searchResult_Page;
import pageObject.cart;
import pageObject.searchPage;
import pageObject.searchResult;
import resources.base;

public class flipkartRunner {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		base b = new base();
		driver=b.initializeDriver();
		b.openFlipkartUrl();
		
		search_Page sP= new search_Page(driver);
		sP.searchTv("vu tv 32 inches");
		sP.windowHandles();
		
		searchResult_Page sR = new searchResult_Page(driver);
		sR.getPrice();
		sR.clickOnAddToCart();
		
		cartPage cP= new cartPage(driver);
		cP.clickOnPlusButton();
		String totalPriceAfterAdding=cP.totalPrice();	
		
		//Printing total price after increasing another product
		
		System.out.println("Total Price of the Product after adding another is : "+totalPriceAfterAdding);
		
		b.teardown();
	}

}
