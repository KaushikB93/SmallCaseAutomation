package pageObject;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchPageAmazon {
	
	public WebDriver driver;
	
	By searchAmazon= By.xpath("//input[@id='twotabsearchtextbox']");
	By searchResultAmazon= By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']");
	
	public searchPageAmazon(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public WebElement searchAmazon()
	{
		return driver.findElement(searchAmazon);
	}
	
	public WebElement searchResultAmazon()
	{
		
		List<WebElement> listOfElements = driver.findElements(searchResultAmazon);
		System.out.println("Number of elements:" +listOfElements.size());
		WebElement anchor=null;
		Iterator<WebElement> i = listOfElements.iterator();
		while(i.hasNext()) {
		     anchor = i.next();
		     break;
		    }
		System.out.println(anchor);
		return anchor;
	}


}
