package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignUpPageObjects;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.Constants;

public class SignUpTestCases extends BaseClass
{
	@Test
	public void verifySignUp() throws IOException, InterruptedException
	{
		
		
		LoginPageObjects lpo = new LoginPageObjects(driver);
		
		lpo.TryforFree().click();
		
		SignUpPageObjects spo = new SignUpPageObjects(driver);
		
		Thread.sleep(5000);
		
		spo.Firstname().sendKeys(Constants.username);
		
		spo.Lastname().sendKeys(Constants.password);
		
		spo.JobTitle().sendKeys(Constants.JobTitle);
		
		Thread.sleep(5000);
		
		spo.NextButton().click();
	
		spo.PhoneNo().sendKeys(Constants.Phoneno);
		
		spo.Email().sendKeys(Constants.Email);
		
		
		/*WebElement con = spo.Country();
		Select c = new Select (con);
		c.selectByValue("IN");*/
		
		
		
		CommonMethods.SelectDropdown(spo.Country(), 1);  // Country Dropdwon
		
		CommonMethods.SelectDropdown(spo.StateProvince(), 3); // Province Dropdown
		
		spo.NextButton().click();
		
		spo.Company().sendKeys(Constants.Company);
		
		CommonMethods.SelectDropdown(spo.Employee(), 2); // Employee Dropdown
		
		/*WebElement a = spo.Employee();
		Select s = new Select(a);
		s.selectByIndex(2); */
		
		
		WebElement l = spo.CompanyLanguage();
		Select w = new Select(l);
	    w.selectByValue("ja");
		
		WebElement check = spo.CheckboxTerms();
		check.click();
		
		CommonMethods.VerifyAssertions(spo.SignupConfirm(), Constants.SignupExpectederror, "Signup Text message does not match");
		
		/*WebElement signUp = spo.SignupConfirm();
		
		String ActualSignUpText = signUp.getText();
		
		String ExpectedSignupText = Constants.SignupExpectederror;
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ActualSignUpText,ExpectedSignupText,"Signup Text message does not match");
		sa.assertAll();*/
		
		
		
		
	}
}
