package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cartAmazon {
	
public WebDriver driver;
	
	By totalPrice= By.xpath("//span[@class='a-size-medium a-color-price sc-price sc-white-space-nowrap sc-product-price sc-price-sign a-text-bold']");
	
	
	public cartAmazon(WebDriver driver) {		
		this.driver=driver;		
	}
	
	public WebElement totalPriceAmazon()
	{
		return driver.findElement(totalPrice);
	}
	
}
