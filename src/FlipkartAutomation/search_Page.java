package FlipkartAutomation;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import pageObject.cart;
import pageObject.searchPage;
import pageObject.searchResult;
import resources.base;


public class search_Page {
	
	WebDriver driver;
	public search_Page(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void searchTv(String typeSearch) throws IOException
	{
		searchPage sp= new searchPage(driver);
		sp.search().sendKeys(typeSearch);
		//to hit enter for finding the search results
		Actions builder = new Actions(driver);        
		builder.sendKeys(Keys.ENTER);
		
		sp.searchResult().click();	
	}
//after clicking on the search result it opens in a new window, for that we have to switch the focus to the new window	
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


