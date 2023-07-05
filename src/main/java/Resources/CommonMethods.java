package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonMethods 
{
	public static void SelectDropdown(WebElement element, Integer index)
	{
		WebElement a = element;
		Select s = new Select(a);
		s.selectByIndex(index);; 
	}
	
	public static void VerifyAssertions(WebElement actual, String expectedtext, String message)
	{
		WebElement a = actual;
		
		String ActualText = a.getText();
		
		String ExpectedErrorMessage = expectedtext;
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(ActualText,expectedtext,message);
			
		sa.assertAll();
	}


}
