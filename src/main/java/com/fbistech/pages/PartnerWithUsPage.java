package com.fbistech.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
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
	
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Schools/Organizations')]") // "//a[contains(text(),'For Sponsors/Organization')]"
	@CacheLookup
	WebElement schools_OrganizationsLink;
	
	
	
	

	@FindBy(xpath = "//a[contains(text(),'Teach on BeamSity')]") 
	@CacheLookup
	WebElement techOnBeamsityLink;
	
	
	
	
	@FindBy(xpath = "//div[contains(text(),'Contact Us!')]")
	@CacheLookup
	WebElement contactUsText;
	

	
	
	@FindBy(xpath = "//a[contains(text(),'Contact Us')]")  //span[contains(text(),'Contact Us')] | //a[text()='Contact Us']
	@CacheLookup
	WebElement contactUsLink1;
	
	
	
	@FindBy(xpath = "//button[normalize-space()='Contact Us']")
	@CacheLookup
	WebElement contactUsLink2;
	
	
	
	
	@FindBy(xpath = "//a[normalize-space()='Login']") // "//a[contains(text(),'Sign In')]"
	@CacheLookup
	WebElement logInLink;
	
	
	
	@FindBy(xpath = "//a[normalize-space()='Partner with us']")
	@CacheLookup
	WebElement partnerWithUsLink;
	
	

//	  <---------------- Get Started with BeamSity form page  -------------------------->	
	
	
	@FindBy(xpath = "//button[@id='Tutor']") 
	WebElement tutorFormBtn;
	
	
	@FindBy(xpath = "//button[@id='School/Organization']")  
	WebElement school_OrganizationFormBtn;
	

	@FindBy(xpath = "//button[@id='Sponsor']")  
	WebElement sponsorFormBtn;
	
	
	
	@FindBy(xpath = "//input[@id='schoolName']")  
	WebElement schoolNameField;
	
	
	
	@FindBy(xpath = "//input[@id='first_name']") 
	WebElement firstName;

	
	
	@FindBy(xpath = "//input[@id='last_name']") 
	WebElement lastName;
	
	
	
	@FindBy(xpath = "//input[@id='email']") 
	WebElement email;

	
	
	@FindBy(xpath = "//input[@id='phone_number']") 
	WebElement phoneNo;

	
	
	@FindBy(xpath = "//button[contains(text(),'Proceed')]") 
	WebElement proceedButton;
	
	
	
	
	
  
	
	
	
	

	

	
	
	@FindBy(xpath = "//span[normalize-space()='50 Awolowo Road, Ikoyi, Lagos, Nigeria']")
	@CacheLookup
	WebElement officeAddress;
	

	

	@FindBy(xpath = "//a[contains(text(),'info@beamsity.com')]")
	@CacheLookup
	WebElement contactEmail;
	
	
	

	@FindBy(xpath = "//div[@class='innerContainer']//div[1]")
	@CacheLookup
	WebElement phoneNumber;
	
	
	
	@FindBy(xpath = "//span[normalize-space()='Get Direction']")
	@CacheLookup
	WebElement getDirection;
	

//	  <----------------  PAGE NAEME LABEL  -------------------------->	
	
	

	@FindBy(xpath = "//h5[contains(text(),'BeamSity for Organizations')]") 
	@CacheLookup
	WebElement schools_OrganizationsPageNameLabel; 
	
	
	
	@FindBy(xpath = "//h5[contains(text(),'Make an Impact')]")
	@CacheLookup
	WebElement teachOnBeamsityPageNameLabel; 
	

	
	
	@FindBy(xpath = "//div[contains(text(),'Contact Us!')]")
	@CacheLookup
	WebElement contactUsPageNameLabel;
	
	
	

	@FindBy(xpath = "//div[normalize-space()='Contact Us']")
	@CacheLookup
	WebElement contactUsFooterNameLabel;
	
	
	
	
	@FindBy(xpath = "//div[contains(text(),'Log In')]")
	@CacheLookup
	WebElement loginPageNameLabel; 
	
	
	
	@FindBy(xpath = "//div[contains(text(),'Partner with us today')]")
	@CacheLookup
	WebElement partnerWithUsPageNameLabel;
	
	
	
	
	@FindBy(xpath = "//div[contains(text(),'About Us')]")
	@CacheLookup
	WebElement aboutUspageNameLabel;
	
	
	
	@FindBy(xpath = "//a[contains(text(),'About Us')]")
	@CacheLookup
	WebElement aboutUspageFooterNameLabel;
	
	
	@FindBy(xpath = "//div[@class='leftSection']//div[2]")
	@CacheLookup
	WebElement contactPhoneNumber;
	
	
	@FindBy(xpath = "//div[contains(text(),'Privacy Policy')]")
	@CacheLookup
	WebElement privacyPolicyPageNameLabel;
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Privacy Policy')]")
	@CacheLookup
	WebElement privacyPolicyFooterNameLabel;
	
	
	
	
	@FindBy(xpath = "//span[contains(text(),'50 Awolowo Rd, Ikoyi 106104, Lagos')]")
	@CacheLookup
	WebElement contacUsAddressFooterNameLabel;
	
	
	
	
	@FindBy(xpath = "//li[@class='chakra-toast']//div[@class='chakra-alert__title css-14esyki'][normalize-space()='Success.']")
	@CacheLookup
	WebElement signUpToMailingListSuccessPrompt;
	
	
	
	
	@FindBy(xpath = "//span[contains(.,'BeamSity')]")
	@CacheLookup
	WebElement googlePlayPageNameLabel;

	
	
	
	@FindBy(xpath = "//a[contains(text(),'info@beamsity.com')]")
	@CacheLookup
	WebElement emailAddress;
	

	
//  <----------------  COMPANY  -------------------------->	
	

	@FindBy(xpath = "//a[contains(text(),'About Us')]")
	@CacheLookup
	WebElement aboutUsLink;

	
	@FindBy(xpath = "//a[contains(text(),'Privacy Policy')]")
	@CacheLookup
	WebElement privacyPolicyLink;
	
	 
	

//  <----------------  CONTACT US  -------------------------->	
	
	@FindBy(xpath = "//a[contains(text(),'50, Awolowo Road Ikoyi lagos, Nigeria.')]")
	@CacheLookup
	WebElement  contactAddress;
	
	
	@FindBy(xpath = "//a[contains(text(),'info@beamsity.com')]")
	@CacheLookup
	WebElement  contactEmailFooter;
	

	
//  <----------------  SIGN UP TO MAILING LIST  -------------------------->	
	
	
	@FindBy(xpath = "//input[@placeholder='Email Address']")
	@CacheLookup
	WebElement mailingListEmailField;
	
	
	@FindBy(xpath = "//span[contains(text(),'Signup')]")
	@CacheLookup
	WebElement signUpMailingListButton;
	

	                
	@FindBy(xpath = "//li[@class='chakra-toast']//div[@class='chakra-alert__title css-14esyki'][normalize-space()='Success.']") //button[contains(text(),'Login')] //button[normalize-space()='Login']
	@CacheLookup
	WebElement signUpMailingListSuccess;
	
	

	@FindBy(xpath = "//li[@class='chakra-toast']//div[@class='chakra-alert__desc css-2xkhb3'][normalize-space()='The email must be a valid email address.']")
	@CacheLookup
	WebElement invalidEmailSignUpToMailingListErrorPrompt;
	
	
//  <----------------  DOWNLOAD -------------------------->	
	
	@FindBy(xpath = "//div[@class='right']//a//*[local-name()='svg']")
	@CacheLookup
	WebElement googlePlay;
	
	
	@FindBy(xpath = "//button[@class='ant-btn']//*[local-name()='svg']") //div[@class='right']//a//*[local-name()='svg']
	@CacheLookup
	WebElement googlePlayButton1;
	
	
	
	@FindBy(xpath = "//*[name()='div' and contains(@class,'footerList')]"
			+ "//*[name()='a' and contains(@href,'https://pl')]"
			+ "//*[name()='button' and contains(@type,'button')]")
	@CacheLookup
	WebElement googlePlayButton2;
	
	
	
	@FindBy(xpath = "//button[contains(text(),'Installed')]") //button[normalize-space()='Installed']  
	@CacheLookup
	WebElement installationLink;
	
	
	
	
	@FindBy(xpath = "//span[@class='DPvwYc']") 
	@CacheLookup
	WebElement selectInstallationPhone;
	
	

	
	
	
	
	
	


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
	
	
	
	
	
	
	
	
	
	


	public PartnerWithUsPage validateClickOnSchools_OrganizationsLink()
	{
		schools_OrganizationsLink.click();
		return new PartnerWithUsPage(); 
	}
	
	
	public String validateCorrectSchools_OrganizationsPageName()
	{
		return schools_OrganizationsPageNameLabel.getText();
	}
	
	
	
	public PartnerWithUsPage validateClickOnTechOnBeamsityLink()
	{
		techOnBeamsityLink.click();
		return new PartnerWithUsPage();
	}
	
	
	public String validateCorrectTeachOnBeamsityPageName() throws Exception
	{
		return teachOnBeamsityPageNameLabel.getText();
	}
	
	
	
	
	
	public PartnerWithUsPage validateClickOnContactUsLinkOnNavBar() throws Exception
	{
		contactUsLink1.click();
		return new PartnerWithUsPage();
	}
	
	
	public PartnerWithUsPage validateClickOnContactUsLinks() throws Exception
	{
		contactUsLink1.click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(3000);
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0, 2600);");
		Thread.sleep(4000);
		contactUsLink2.click();
		return new PartnerWithUsPage();
	}
	
	
	public String validateCorrectContactUsPageName()
	{
		return contactUsPageNameLabel.getText();
	}
	
	

	public String validateCorrectContactUsFooterName()
	{
		return contactUsFooterNameLabel.getText();
	}
	
	
	
	
	
	
	public PartnerWithUsPage validateClickOnLoginLink() throws Exception
	{
		logInLink.click();
		return new PartnerWithUsPage();
	}
	  
	
	public String validateCorrectLoginPageName()
	{
		return loginPageNameLabel.getText();
	}
	
	
	
	
	
	
	public PartnerWithUsPage validatePartnerWithUsLink()
	{
		partnerWithUsLink.click();
		return new PartnerWithUsPage();
	}
	

	public String validateCorrectPartnerWithUsPageName()
	{
		return partnerWithUsPageNameLabel.getText();
	}
	
	

//-------------------------------------------	
	
	
	
	public PartnerWithUsPage validateCreateNewTutor(String firstNm, String lastNm, String e_Mail, String mobileNo) throws Exception
	{	
//		Select selectInterestdd = new Select(selectInterest);
//		selectInterestdd.selectByIndex(3);
		
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0, 400);");
		Thread.sleep(4000);
		firstName.sendKeys(firstNm);
		Thread.sleep(2000);
		lastName.sendKeys(lastNm);
		Thread.sleep(2000);
		email.sendKeys(e_Mail);
		Thread.sleep(2000);
		phoneNo.sendKeys(mobileNo);
		
//		
//		Select selectCourseOfInterestdd = new Select(selectCourseOfInterest);
//		selectCourseOfInterestdd.selectByVisibleText("course two");
//		
		Thread.sleep(2000);
		proceedButton.click();
		return new PartnerWithUsPage();
	} 
	
	
	
	
	
	
	
	
	public HomePage createNewSponsor(String fN, String lN, String email, String mobileNo)
	{	
		firstName.sendKeys(fN);
		lastName.sendKeys(lN); 
		emailAddress.sendKeys(email);
		phoneNo.sendKeys(mobileNo);
	
		proceedButton.click();
		return new HomePage();
	} 
	
	
//	public PartnerWithUsPage verifyCountryDropdownValue()
//	{
//		
//		String arr[] = {"Select", "Country one", "Country two", "Country three"};
//		
//		Select countrySelect = new Select(selectCountry);
//
//		List<WebElement> dropdownvaluesList = countrySelect.getOptions();
//		System.out.println(dropdownvaluesList.size());
//		
//		for(int i=0; i<dropdownvaluesList.size(); i++)
//			
//		{
//			Assert.assertEquals(arr[i], dropdownvaluesList.get(i).getText());
//		}
//		System.out.println("Country Verification Successfull");
//		
//		return new PartnerWithUsPage();
//	}
//	
//	
//	public PartnerWithUsPage verifyCityropdownValue()
//	{
//		
//		String arr[] = {"Select", "City one", "City two", "City three"};
//		
//		Select citySelect = new Select(selectCity);
//
//		List<WebElement> dropdownvaluesList = citySelect.getOptions();
//		System.out.println(dropdownvaluesList.size());
//		
//		for(int i=0; i<dropdownvaluesList.size(); i++)
//			
//		{
//		Assert.assertEquals(arr[i], dropdownvaluesList.get(i).getText());
//		}
//		System.out.println("City Verification Successfull");
//		
//		return new PartnerWithUsPage();
//	} 

	
	
	
	
	
	
	
	
	
//------------------	
	
	public boolean validateOfficeAdressLabel() 
	{
		return officeAddress.isDisplayed();	
	}


	
	
	
	public String validateCorrectContactOfficePhoneNumber() throws Exception
	{
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0, 1100);");
		Thread.sleep(4000);
		return contactPhoneNumber.getText();
	}
	

	

	
	
	
	
	public PartnerWithUsPage validateClickOnAboutUsLink() throws Exception
	{
		Thread.sleep(3000);
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView(true)", aboutUsLink);
		Thread.sleep(4000);
		aboutUsLink.click();
		return new PartnerWithUsPage();
	}
	
	
	public String validateCorrectAboutUsPageName()
	{
		return aboutUspageNameLabel.getText();
	}
	
	public String validateCorrectAboutUsFooterName()
	{
		return aboutUspageFooterNameLabel.getText();
	}
	
	
	
	
	public PartnerWithUsPage validateClickOnPrivacyPolicyLink() throws Exception
	{
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0, 4000);");
		Thread.sleep(4000);
	    privacyPolicyLink.click();
		return new PartnerWithUsPage();
	}

	
	public String validateCorrectPrivacyPolicyPageName()
	{
		return privacyPolicyPageNameLabel.getText();
	}
	
	
	public String validateCorrectPrivacyPolicyFooterName()
	{
		return privacyPolicyFooterNameLabel.getText();
	}
	
	
	
	
	

	public ContactUsPage validateClickOnContactUsOfficeAddress() throws Exception
	{
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0, 1100);");
		Thread.sleep(5000);
		getDirection.click();
		Thread.sleep(5000);

		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(0));
		Thread.sleep(5000);

		
		contactAddress.click();
		return new ContactUsPage();
	}
	
	
	public String validateCorrectGoogleMapContactUsOfficeAddress()
	{
		return contacUsAddressFooterNameLabel.getText();
	}
	
	
	
	
	
	
	
	public ContactUsPage  validateClickOnContactEmail() throws Exception
	{
		Thread.sleep(3000);
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView(true)", contactEmail);
		Thread.sleep(4000);
		contactEmail.click();
		return new ContactUsPage();
	}
	
	
	public String validateCorrectEmailAddressName()
	{
		return emailAddress.getText();
	}
	
	
	
	
	
	

	public ContactUsPage validateSignUpToMailingList(String userEmail) throws Exception
	{
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0, 4000);");
		Thread.sleep(3000);
		mailingListEmailField.sendKeys(userEmail);
		Thread.sleep(4000);
//		signUpMailingListButton.click();
		return new ContactUsPage();
	}
	
	
	
	
	public String validateSignUpToMailingListSuccessPrompt()
	{
		return signUpToMailingListSuccessPrompt.getText();
	}
	
	
	
	
	
	public ContactUsPage validateSignUpToMailingListWithInvalidEmailFormat(String emailWithOutDotCom) throws Exception
	{
		Thread.sleep(3000);
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView(true)", signUpMailingListButton);
		Thread.sleep(3000);
		mailingListEmailField.sendKeys(emailWithOutDotCom);
		Thread.sleep(4000);
//		signUpMailingListButton.click();
		return new ContactUsPage();
	}
	
	
	
	public String validateSignUpToMailingListInvalidEmailErrorPrompt()
	{
		return invalidEmailSignUpToMailingListErrorPrompt.getText();
	}
	
	
	
	
	
	
	public ContactUsPage validateClickOnGooglePlayLlink() throws InterruptedException
	{
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0, 3300);");
		Thread.sleep(4000);
		googlePlayButton1.click();	
		
//		Switch back to the initial tab 
		Thread.sleep(6000);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(0));
		
//		Scroll down and click Google play
		scroll.executeScript("arguments[0].scrollIntoView(true)", googlePlayButton2);
		Thread.sleep(4000);
		googlePlayButton2.click();	
		
		return new ContactUsPage();
	}
	
	
	
	public String validateCorrectGooglePlayPageName() throws Exception
	{
		return googlePlayPageNameLabel.getText();
	}
	
	
	
	
	
	
	
	public ContactUsPage validateUserInstallBeamsityApp() throws Exception
	{
		Thread.sleep(4000);
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView(true)", googlePlayButton2);
		
		Thread.sleep(4000);
		googlePlayButton2.click(); 
		
		
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(4000);		
		installationLink.click();
		
//		Thread.sleep(4000);
//		selectInstallationPhone.click();
		return new ContactUsPage();
	}
	
	
	

		
		
		
		
		

	
	
}
