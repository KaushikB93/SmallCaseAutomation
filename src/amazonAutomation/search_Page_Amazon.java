package amazonAutomation;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import pageObject.cart;
import pageObject.searchPage;
import pageObject.searchPageAmazon;
import pageObject.searchResult;
import resources.base;


public class search_Page_Amazon {
	
	WebDriver driver;
	public search_Page_Amazon(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void searchTvAmazon(String typeSearch) throws IOException
	{
		searchPageAmazon sp= new searchPageAmazon(driver);
		sp.searchAmazon().sendKeys(typeSearch);
		
		Actions builder = new Actions(driver);        
		builder.sendKeys(Keys.ENTER);
		
		sp.searchResultAmazon().click();	
	}
	
	public void windowHandles() {
		Set<String> wH= driver.getWindowHandles();
		Iterator<String> its=wH.iterator();
		String mainWindow=its.next();
		String childWindow=its.next();
	    // Compare whether the main windows is not equal to child window. If not equal, we will close.
	    if(!mainWindow.equals(childWindow)){
	    	driver.switchTo().window(childWindow);
	    	System.out.println(driver.getTitle());
	    }

	}
	
}


