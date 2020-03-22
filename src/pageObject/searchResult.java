package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchResult {

	public WebDriver driver;
	
	By priceOfProduct= By.xpath("//div[@class='_1vC4OE _3qQ9m1']");
	By addToCartButton= By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']");
	By nameOfProduct= By.xpath("//span[@class='_35KyD6']");
	
	public searchResult(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public WebElement priceOfProduct()
	{
		return driver.findElement(priceOfProduct);
	}
	
	public WebElement addToCartButton()
	{
		return driver.findElement(addToCartButton);
	}
	
	public WebElement nameOfProduct()
	{
		return driver.findElement(nameOfProduct);
	}

}
