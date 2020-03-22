package amazonAutomation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObject.cart;
import pageObject.cartAmazon;
import pageObject.searchResult;

public class cartPage_Amazon {
	
	WebDriver driver;
	public cartPage_Amazon(WebDriver driver) {		
		this.driver=driver;		
	}
	
	public String totalPriceAmazon() throws IOException
	{
		cartAmazon cP= new cartAmazon(driver);
		String totalPrice=cP.totalPriceAmazon().getText();
		return totalPrice;
	}
}
