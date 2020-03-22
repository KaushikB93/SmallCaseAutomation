package FlipkartAutomation;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import pageObject.cart;

public class cartPage {
	
	WebDriver driver;
	public cartPage(WebDriver driver) {		
		this.driver=driver;		
	}
	
	public void clickOnPlusButton() throws IOException
	{
		cart cP= new cart(driver);
		cP.plusButton().click();

	}
	
	public String totalPrice() throws IOException
	{
		cart cP= new cart(driver);
		String totalPriceAfterAdding=cP.totalPrice().getText();
		return totalPriceAfterAdding;
	}


}
