package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects 
{
	public WebDriver driver;
	
	
	
	private By Firstname = By.xpath("//input[@name='UserFirstName']");
	
	private By Lastname = By.xpath("//input[@name='UserLastName']");
	
	private By JobTitle = By.xpath("//input[@name='UserTitle']");
	
	private By NextButton = By.xpath("//span[contains(text(),'Next')]");
	
	private By PhoneNo = By.xpath("//input[@name='UserPhone']");
	
	private By Email =By.xpath("//input[@name='UserEmail']");
	
	private By Country =By.xpath("//select[@name='CompanyCountry']");
	
	private By Company = By.xpath("//input[@name='CompanyName']");
	
	private By Employee = By.xpath("//select[@name='CompanyEmployees']");
	
	private By CompanyLanguage = By.xpath("//select[@name='CompanyLanguage']");
	
	private By CheckBoxTerms = By.xpath("//div[@class='checkbox-ui'][1]");
	
	private By StateProvince = By.xpath("//select[@name='CompanyState']");
	
	private By SignupPageConfirmation = By.xpath("//h3[@id='answer-3-more-questions-and-well-get-you-into-your-free-trial']");
	

	public SignUpPageObjects(WebDriver driver) 
	{
		this.driver=driver;
	}

	

	public WebElement Firstname()
	{
		return driver.findElement(Firstname);
	}
	
	public WebElement Lastname()
	{
		return driver.findElement(Lastname);
	}
	
	public WebElement JobTitle()
	{
		return driver.findElement(JobTitle);
	}
	
	public WebElement NextButton()
	{
		return driver.findElement(NextButton);
	}
	
	public WebElement PhoneNo()
	{
		return driver.findElement(PhoneNo);
	}

	public WebElement Email()
	{
		return driver.findElement(Email);
	}
	
	public WebElement Country()
	{
		return driver.findElement(Country);
	}
	
	
	public WebElement Company()
	{
		
		return driver.findElement(Company);
	}
	
	
	public WebElement Employee()
	{
		return driver.findElement(Employee);
	}
	
	public WebElement CompanyLanguage()
	{
		return driver.findElement(CompanyLanguage);
	}
	
	public WebElement CheckboxTerms()
	{
		return driver.findElement(CheckBoxTerms);
	}
	
	public WebElement StateProvince()
	{
		return driver.findElement(StateProvince);
	}
	
	public WebElement SignupConfirm()
	{
		return driver.findElement(SignupPageConfirmation);
		
	}
}
