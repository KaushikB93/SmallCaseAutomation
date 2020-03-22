package runnerPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import FlipkartAutomation.search_Page;
import amazonAutomation.cartPage_Amazon;
import amazonAutomation.searchResult_Page_Amazon;
import amazonAutomation.search_Page_Amazon;
import FlipkartAutomation.cartPage;
import FlipkartAutomation.searchResult_Page;
import resources.base;

public class comparingPriceRunner {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver;
		base b = new base();
		driver=b.initializeDriver();
		b.openFlipkartUrl();
		
		search_Page sP= new search_Page(driver);
		sP.searchTv("KLV-32R202F");
		sP.windowHandles();
				
		searchResult_Page sR = new searchResult_Page(driver);
		sR.getPrice();
		sR.clickOnAddToCart();
		String nameOfProductFlipkart=sR.nameOfTheProduct();
		System.out.println("Name of the Product in Flipkart : "+nameOfProductFlipkart);
		
		cartPage cP= new cartPage(driver);
		String totalPriceFlipkart=cP.totalPrice();		
		System.out.println("Total Price of the Product after adding another is : "+totalPriceFlipkart);
		
        b.openAmazonUrl();
		
		search_Page_Amazon sPA= new search_Page_Amazon(driver);
		
		//used the same product name that we selected in flipkart to search in amazon
		
		sPA.searchTvAmazon(nameOfProductFlipkart);
		sPA.windowHandles();
			
		searchResult_Page_Amazon sRA = new searchResult_Page_Amazon(driver);
		sRA.getPriceAmazon();
		sRA.clickOnAddToCartAmazon();
		String nameOfProductAmazon=sRA.nameOfTheProductAmazon();
		System.out.println("Name of the Product in Flipkart : "+nameOfProductAmazon);
		
		cartPage_Amazon cPA= new cartPage_Amazon(driver);
		String totalPriceAmazon=cPA.totalPriceAmazon();		
		System.out.println("Total Price of the Product after adding another is : "+totalPriceAmazon);
		
	// used string functions to select only the numbers in the string
		
		totalPriceFlipkart = totalPriceFlipkart.replaceAll("[^0-9]", "");        
		System.out.println(totalPriceFlipkart);
		
	// used string functions to select only the numbers and decimal in the string
		
		totalPriceAmazon = totalPriceAmazon.replaceAll("[^0-9.]", "");        
		System.out.println(totalPriceAmazon);
		
	// to select only numbers from the string used substring
		
		int indexOfDecimal = totalPriceAmazon.indexOf(".");
		String finalPriceOfAmazonProduct = totalPriceAmazon.substring(0, indexOfDecimal);
		
	// converted the final price to integer from string
		int priceFlipkart = Integer.parseInt(totalPriceFlipkart);
		int priceAmazon = Integer.parseInt(finalPriceOfAmazonProduct);
		
		if(priceFlipkart>priceAmazon) {
			System.out.println("Price of flipkart is higher than amazon , so buy the product from Amazon");
		}else if(priceFlipkart<priceAmazon) {
			System.out.println("Price of amazon is higher than flipkart , so buy the product from flipkart");
		}else {
			System.out.println("Price of amazon and flipkart is same , so buy the product from which ever site you like");
		}
		
		b.teardown();
		
	}

}
