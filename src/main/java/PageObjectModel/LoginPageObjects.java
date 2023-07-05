package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects 
{
	
	public WebDriver driver;
	
	private By username=By.xpath("//input[@id='username']");
	
	private By password=By.xpath("//input[@id='password']");
	
	private By Login=By.xpath("//input[@id='Login']");
	
	private By TryforFree = By.xpath("//a[@id='signup_link']");
	
	private By LoginPageError =By.xpath("//div[@id='error']");
	
	public LoginPageObjects(WebDriver driver) 
	{
		this.driver=driver;
	}

	

	public WebElement enterUsername()
	{
		return driver.findElement(username);
	}
	
	public WebElement enterPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement ClickOnLogin()
	{
		return driver.findElement(Login);
	}
	
	public WebElement TryforFree()
	{
		return driver.findElement(TryforFree);
	}
	
	public WebElement LoginPageError()
	{
		return driver.findElement(LoginPageError);
	}
}
