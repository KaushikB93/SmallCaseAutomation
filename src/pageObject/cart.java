package pageObject;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cart {
	
public WebDriver driver;
	
	By totalPrice= By.xpath("//span[@class='pMSy0p XU9vZa']");
	By plusButton= By.xpath("//button[@class='wNrY5O']");
	
	public cart(WebDriver driver) {		
		this.driver=driver;		
	}
	
	public WebElement totalPrice()
	{
		return driver.findElement(totalPrice);
	}
	//here we keep list of elements with same xpath in a list and select the + button to increase the number of products	
	public WebElement plusButton()
	{
		List<WebElement> listOfElements = driver.findElements(plusButton);
		System.out.println("Number of elements:" +listOfElements.size());
		WebElement anchor=null;
		Iterator<WebElement> i = listOfElements.iterator();
		while(i.hasNext()) {
		     anchor = i.next();
		     String sign= anchor.getText();
		     if(sign.equals("+")) {
		    	 System.out.println(i);
		    	 break;
		     }
		    }
		System.out.println(anchor);
		return anchor;
	}

}
