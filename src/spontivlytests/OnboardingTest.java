package spontivlytests;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import Spontivlyobjectsonboarding.Onboardingobjects;
import java.net.MalformedURLException;
//import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


import generalSpontivly.Testbasespon;

public class OnboardingTest extends Testbasespon {
	IOSDriver<IOSElement> driver;
	Onboardingobjects onboardingobjects;
	
	
	@BeforeTest
	public void initiateDrive() throws MalformedURLException  {
		driver=mycapabilities1();
		Onboardingobjects onboardingobjects=new	Onboardingobjects(driver);
	}
	
	@Test
	public void OnboardingTest1() throws MalformedURLException  { 
		/*
		IOSDriver<IOSElement> driver=mycapabilities1();
		*/
		Onboardingobjects onboardingobjects=new	Onboardingobjects(driver);
		 
	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		onboardingobjects.CheckBox.click();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		onboardingobjects.ContinueButton.click();
	}
	
	@Test
	
	public void OnboardingTest2() throws MalformedURLException  { 
		/*
	IOSDriver<IOSElement> driver=mycapabilities1();
	*/
	Onboardingobjects onboardingobjects=new	Onboardingobjects(driver);
	
	onboardingobjects.AddNameButton.click();
	onboardingobjects.AddNameButton.sendKeys("Sergey");
	driver.hideKeyboard();
	onboardingobjects.AddNameContinueButton.click();
	String actualScreencaption;
	  actualScreencaption=driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\'Hey Sergey, when’s your birthday?\']\n").getAttribute("label");
	  boolean isFound = actualScreencaption.contains("Sergey");
	  	Assert.assertEquals(isFound, true);

	}
	
	@Test
	public void OnboardingTest3() throws MalformedURLException  {
	//IOSDriver<IOSElement> driver=mycapabilities1();
	Onboardingobjects onboardingobjects=new	Onboardingobjects(driver);
	onboardingobjects.AddDateBirth.click();
	onboardingobjects.AddDateBirth.sendKeys("30");
	onboardingobjects.AddMonthBirth.click();
	onboardingobjects.AddMonthBirth.sendKeys("07");
	onboardingobjects.AddYearBirth.click();
	onboardingobjects.AddYearBirth.sendKeys("1992");
	onboardingobjects.AddBirthContinueButton.click();
	onboardingobjects.AddPhoneNumberField.click();
	onboardingobjects.AddPhoneNumberField.sendKeys("965385403");
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	onboardingobjects.ChooseCountryNumber.click();
	onboardingobjects.AddPhoneContinueButton.click();
	}	
}
