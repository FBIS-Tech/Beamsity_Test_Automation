package com.fbistech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.fbistech.base.TestBase;

public class PartnerWithUsPage extends TestBase {
	
	String country;
	String city;

	
//	PageFactory - Object Repository 
	

	@FindBy(xpath = "//div[@class='leftNavside']//a//*[local-name()='svg']") //div[@class='leftNavside']//a
	@CacheLookup
	WebElement beamsityLogo;
	
	

	@FindBy(xpath = "//button[@id='Sponsor']") 
	WebElement sponsorFormBtn;
	
	@FindBy(xpath = "//input[@id='first_name']") 
	WebElement firstName;
	
	@FindBy(xpath = "//input[@id='last_name']") 
	WebElement lastName;
	
	@FindBy(xpath = "//input[@id='email']") 
	WebElement emailAddress;

	@FindBy(xpath = "//input[@id='phone_number']") 
	WebElement phoneNo;

	@FindBy(xpath = "//select[@id='country']") 
	WebElement selectCountry;
	
	@FindBy(xpath = "//select[@id='city']") 
	WebElement selectCity;
	
	
	@FindBy(xpath = "//button[contains(text(),'Proceed')]") 
	WebElement proceedBtn;

	
  


//Initializing page objects:
	public PartnerWithUsPage()
	{ 
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateSignUpPageTitle()
	{
		return driver.getTitle();
	}
		
	
	public PartnerWithUsPage clickOnSponsorForm()
	{
		sponsorFormBtn.click();
		return new PartnerWithUsPage();
	} 
	
	
	

	public HomePage validateClickOnBeamsityLogo() 
	{
		beamsityLogo.click();
		return new HomePage();
	}
	
	
	
	
	
	
	
	
	public HomePage createNewSponsor(String fN, String lN, String email, String mobileNo)
	{	
		firstName.sendKeys(fN);
		lastName.sendKeys(lN); 
		emailAddress.sendKeys(email);
		phoneNo.sendKeys(mobileNo);
		
		Select selectCountrydd = new Select((WebElement) selectCountry);
//		selectCountry.selectByValue("option1");
		selectCountrydd.selectByVisibleText("Country one");
		
		Select selectCitydd = new Select((WebElement) selectCity);
		selectCitydd.selectByIndex(2);
		
		proceedBtn.click();
		return new HomePage();
	} 
	
	
	public PartnerWithUsPage verifyCountryDropdownValue()
	{
		
		String arr[] = {"Select", "Country one", "Country two", "Country three"};
		
		Select countrySelect = new Select(selectCountry);

		List<WebElement> dropdownvaluesList = countrySelect.getOptions();
		System.out.println(dropdownvaluesList.size());
		
		for(int i=0; i<dropdownvaluesList.size(); i++)
			
		{
			Assert.assertEquals(arr[i], dropdownvaluesList.get(i).getText());
		}
		System.out.println("Country Verification Successfull");
		
		return new PartnerWithUsPage();
	}
	
	
	public PartnerWithUsPage verifyCityropdownValue()
	{
		
		String arr[] = {"Select", "City one", "City two", "City three"};
		
		Select citySelect = new Select(selectCity);

		List<WebElement> dropdownvaluesList = citySelect.getOptions();
		System.out.println(dropdownvaluesList.size());
		
		for(int i=0; i<dropdownvaluesList.size(); i++)
			
		{
		Assert.assertEquals(arr[i], dropdownvaluesList.get(i).getText());
		}
		System.out.println("City Verification Successfull");
		
		return new PartnerWithUsPage();
	} 

}