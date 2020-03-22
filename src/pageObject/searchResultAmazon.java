package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchResultAmazon {

	public WebDriver driver;
	
	By priceOfProductAmazon= By.xpath("//span[@id='priceblock_ourprice']");
	By addToCartButtonAmazon= By.xpath("//input[@id='add-to-cart-button']");
	By goToCart= By.xpath("//span[@id='attach-sidesheet-view-cart-button-announce']");
	By nameOfProductAmazon= By.xpath("//span[@id='productTitle']");
	
	public searchResultAmazon(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public WebElement priceOfProductAmazon()
	{
		return driver.findElement(priceOfProductAmazon);
	}
	
	public WebElement addToCartButtonAmazon()
	{
		return driver.findElement(addToCartButtonAmazon);
	}
	
	public WebElement goToCartButtonAmazon()
	{
		return driver.findElement(goToCart);
	}
	
	public WebElement nameOfProductAmazon()
	{
		return driver.findElement(nameOfProductAmazon);
	}
}