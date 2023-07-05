package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;


public class BaseClass 
{
	public WebDriver driver; // declare webdriver globally
	
	// To access and take control of the data.properties // Declare globally
	public Properties prop;
	 
	public void initializeDriver() throws IOException
	{
		// To read the data from data.properties
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties"); //system.getpropert("user.dir") for common path on all the systems
		
		prop = new Properties(); 
		prop.load(fs);
		
		String browserName = prop.getProperty("browser"); //getProperty(): It returns the value in this property with the specified Key value(browser is the key and the chrome is the value).
		
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			 driver=new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			 driver=new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("edge")) 
		{
			   
		    driver=new EdgeDriver();
		   
		}
		
		else 
		{
		     
		   System.out.println("please choose proper browser");
		    
		}
	}
	
	@BeforeMethod
	public void launchBrowserURL() throws IOException
	{
		initializeDriver();
		
		driver.get(prop.getProperty("url"));
	}
}
