package pageObject;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// This page has the objects for landing page or the flipkart main main
public class searchPage {
	
	public WebDriver driver;
	
	By search= By.xpath("//input[@class='LM6RPg']");
	By searchResult= By.xpath("//a[@class='_31qSD5']");
	//Parameterized constructor
	public searchPage(WebDriver driver) {
		//this specifies that the driver here is local driver
		this.driver=driver;
		
	}
	
	public WebElement search()
	{
		return driver.findElement(search);
	}
	//here we keep list of elements with same xpath in a list and select the 1st element
	public WebElement searchResult()
	{
		
		List<WebElement> listOfElements = driver.findElements(searchResult);
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
