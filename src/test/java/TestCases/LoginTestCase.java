package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObjects;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.Constants;

public class LoginTestCase extends BaseClass
{
	@Test(dataProvider="testData")
	public void verifyLogin(String un, String pw) throws IOException
	{
		
		LoginPageObjects lpo = new LoginPageObjects(driver);
		
		lpo.enterUsername().sendKeys(un);
		
		lpo.enterPassword().sendKeys(pw);
		
		lpo.ClickOnLogin().click();
		
		CommonMethods.VerifyAssertions(lpo.LoginPageError(),Constants.ExpectedError, "Valid Error Message is not showing");
		
		
		//lpo.TryforFree().click();
		
		/*WebElement a = lpo.LoginPageError();
		
		String ActualText = a.getText();
		
		String ExpectedErrorMessage = Constants.ExpectedError;
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(ActualText,ExpectedErrorMessage,"Valid Error Message is not showing");
			
		sa.assertAll();*/
		
		
	}
	
	 @DataProvider
	 public Object[][] testData() {
	  Object[][] data=new Object[2][2];
	  data[0][0]= Constants.username1;
	  data[0][1]= Constants.password1;
	  data[1][0]=Constants.username2;
	  data[1][1]= Constants.password1;
	  
	  return data;
	  
}
}
