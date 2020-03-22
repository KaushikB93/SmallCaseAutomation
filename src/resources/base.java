package resources;
//This is the resources file which has URLs for sites and browser connections and also has implicity wait
//Teardown for closing the browser and code for screenshot as well.
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	public static WebDriver driver;
	public Properties prop;
	String flipkartUrl;
	String amazonUrl;

//This will be returning the driver as an argument having all the properties initialized.
public WebDriver initializeDriver() throws IOException
{
// making object of the properties so that we can access the urls and the browser to be used.	
prop= new Properties();
FileInputStream fis=new FileInputStream("C:\\Users\\kaushik.Bhuyan\\eclipse-workspace2\\SmallCaseAutomation\\src\\resources\\data.properties");

prop.load(fis);
String browserName=prop.getProperty("browser");
flipkartUrl=prop.getProperty("url");
amazonUrl=prop.getProperty("urlAmazon");

System.out.println(browserName);

if(browserName.equals("chrome"))
{
	
	 System.setProperty("webdriver.chrome.driver", "C://Users//kaushik.Bhuyan//Desktop//New folder (2)//chromedriver_win32//chromedriver.exe");
	driver= new ChromeDriver();
	
}
else if (browserName.equals("firefox"))
{
	 driver= new FirefoxDriver();
}
else if (browserName.equals("IE"))
{
//	IE code
}

driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
return driver;
}

public void openFlipkartUrl() {
	
	driver.get(flipkartUrl);
	driver.manage().window().maximize();
}

public void openAmazonUrl() {
	
	driver.get(amazonUrl);
	driver.manage().window().maximize();
}

public void getScreenshot(String result) throws IOException
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C://test//"+result+"screenshot.png"));
	
}

public void teardown()
{
	
	driver.close();
	driver=null;
	
}

}
